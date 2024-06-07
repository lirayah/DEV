<?php

class Database {
    private $host;
    private $user;
    private $pass;
    private $dbname;
    private $pdo;

	public function __construct($host, $user, $pass, $dbname) {
		$this->host = $host;
		$this->user = $user;
		$this->pass = $pass;
		$this->dbname = $dbname;
	}
	public function connect() {
		$driver_options = [
			PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
			PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC,
		];
		$dsn = "mysql:host=$this->host;dbname=$this->dbname";
		$this->pdo = new PDO($dsn, $this->user, $this->pass,$driver_options);
	}

	public function query($sql, $params = []) {
		$stmt = $this->pdo->prepare($sql);
		if ($stmt->execute($params) === true)
			return $stmt;
		return false;
	}
	public function lastInsertId(){
		return $this->pdo->lastInsertId();
	}
}

class Todo {

	static private $db = NULL;

	public static function init(){
		self::$db = new Database("localhost","morinl","chehsatoru","morinl");
		self::$db->connect();  
	}

	public static function find($id) {
		$sql = "SELECT * FROM  todo WHERE id = ?";
		$stmt  = self::$db->query($sql,[$id]);
		$result = $stmt->fetch();
		return $result;
	}

	public static function findCompleted(){
		$sql = "SELECT * FROM  todo WHERE done = '1'";
		$stmt  = self::$db->query($sql);
		$result = $stmt->fetchAll();
		return $result;
	}

	public static function findUnCompleted(){
		$sql = "SELECT * FROM  todo WHERE done = '0'";
		$stmt  = self::$db->query($sql);
		$result = $stmt->fetchAll();
		return $result;
	}

	public static function findAll() {
		$sql = "SELECT * FROM  todo";
		$stmt  = self::$db->query($sql);
		$result = $stmt->fetchAll();
		return $result;
	}

	public static function update($todo){
		$sql = "UPDATE todo SET text=?, done=? WHERE id=?";
        $stmt = self::$db->query($sql,[
            $todo->text,$todo->done,$todo->id
        ]);
        $result = $stmt->fetchAll();
        return $result;
	}

	public static function create($todo){
        if ($todo !== null) {
            $sql = "INSERT INTO todo(text,done) VALUES (?,?)";
            $stmt = self::$db->query($sql, [
                $todo->text, 0
            ]);
            $result = $stmt->fetchAll();
            return $result;
        } else {
            return false;
        }
	}

	public static function delete($id){
		$sql = "DELETE FROM todo WHERE id=?";
        $stmt = self::$db->query($sql, [
            $id
        ]);
        $result = $stmt->fetchAll();
        return $result;
	}
}

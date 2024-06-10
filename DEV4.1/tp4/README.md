# TP : Une api rest pour la todo list.

Le but de l'exercice est d'écrire une api de données restful pour l'application todolist du
[tp2](../tp2).


Les routes de notre api :

```
get /todo/(:id)
post /todo
delete /todo/:id
put /todo/:id
```

- Pour routage et les entrées/sorties http, on utilise [flight php](https://flightphp.com/).
- Pour les entrées/sorties avec la base données, il vous faut compléter le [modèle](./src/model) qui utilise PDO.

Copiez le fichier `.htaccess` à la racine de vos sources pour activer la réécriture d'urls.

```apache
Require method GET POST PUT DELETE OPTIONS
RewriteEngine On
RewriteCond %{REQUEST_FILENAME} !-f
RewriteCond %{REQUEST_FILENAME} !-d
RewriteRule ^(.*)$ index.php [QSA,L]
```

Votre api pour l'instant :

```php
<?php
require 'flight/Flight.php';
require 'model/model.php';

Todo::init();

Flight::route('GET /todo(/@id)','getTodos');
//Flight::route('POST /todo','addTodo');
//Flight::route('DELETE /todo/@id','deleteTodo');
//Flight::route('PUT /todo/@id','updateTodo');



function getTodos($id = null)
{
	$filter = Flight::request()->query->filter ?? "all";

	if ($id === null){
		switch($filter){

		case "done":
			$todos = Todo::findCompleted();
			break;

		case "active":
			$todos = Todo::findUnCompleted();
			break;

		default:
			$todos = Todo::findAll();

		}

		Flight::json(
			[
				"results" => $todos
			]			
		);
	} else {

		$todo = Todo::find($id);

		if ($todo)
			Flight::json($todo);
		else
			Flight::halt(404);
	}
}

Flight::start();

```

Le modèle à compléter :

```php
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
		// CHANGER AVEC VOS PARAMETRES
		self::$db = new Database("localhost","test","test","todo");
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
		// TODO
	}

	public static function create($todo){
		// TODO
	}

	public static function delete($id){
		// TODO
	}
}
```


Complétez le fichier index.php et le modèle, et connectez votre application js à **votre api**.

> Remarque : vous pouvez tester votre api, à la ligne de commandes, avec `curl`.

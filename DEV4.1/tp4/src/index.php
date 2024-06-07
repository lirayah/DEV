<?php

require 'flight/Flight.php';
require 'model/model.php';

Todo::init();

Flight::route('GET /todo(/@id)','getTodos');
Flight::route('POST /todo','addTodo');
Flight::route('DELETE /todo/@id','deleteTodo');
Flight::route('PUT /todo/@id','updateTodo');

function addTodo()
{
    $todo = Flight::request()->data;
    Todo::create($todo);
}

function deleteTodo(int $id)
{
    if ($id === null) {
        Flight::halt(404);
    }
    Todo::delete($id);
}

function updateTodo(int $id)
{
    if ($id === null) {
        Flight::halt(404);
    }
    $todo = Flight::request()->data;
    $todo->__set("id", $id);
    Todo::update($todo);
}

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

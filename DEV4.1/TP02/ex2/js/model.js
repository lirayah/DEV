const todos = [ 
	{ 
		id : 1, 
		text : "apprendre le javascript",
		done : false

	},
	{ 
		id : 2, 
		text : "Faire des maths",
		done : false

	}]

export default class Model {
	constructor() {
		//this.todos = JSON.parse(localStorage.getItem('todos')) || []
		this.todos = this.getTodos();
	}

	_commit(todos) {
		localStorage.setItem('todos', JSON.stringify(todos))
	}

	getTodos(filter){
		return fetch("https://dwarves.iut-fbleau.fr/~morinl/DEV4.1/tp4/src/todo").then(response => {
			return response.json();
		});

		if (filter == "active")
			return this.todos.filter(todo => !todo.done)
		if (filter == "done")
			return this.todos.filter(todo => todo.done)

		return this.todos
	}

	add(todoText) {
		const todo = {
			id: this.todos.length > 0 ? this.todos[this.todos.length - 1].id + 1 : 1,
			text: todoText,
			done : false,
		}

		this.todos.push(todo)
		this._commit(this.todos)
		return todo
	}

	edit(id, updatedText) {
	let todo = this.todos.find(t => t.id === id)
	todo.text = updatedText
	//	this.todos = this.todos.map(todo =>
	//		todo.id === id ? { id: todo.id, text: updatedText, done: todo.done} : todo
	//	)

		this._commit(this.todos)
	}


	delete(id) {
		this.todos = this.todos.filter(todo => todo.id !== id)

		this._commit(this.todos)
	}

	toggle(id) {
		let todo = this.todos.find(t => t.id === id)
		todo.done = !todo.done
		//this.todos = this.todos.map(todo =>
		//	todo.id === id ? { id: todo.id, text: todo.text, done: !todo.done } : todo
		//)
		this._commit(this.todos)
	}
}

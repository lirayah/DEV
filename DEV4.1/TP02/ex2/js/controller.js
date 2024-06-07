export default class Controller {
	constructor(model, view) {
		this.model = model
		this.view = view
		this.filter = "all"
		this.view.bindAddTodo(this.addTodo.bind(this))
		this.view.bindDeleteTodo(this.deleteTodo.bind(this))
		this.view.bindToggleTodo(this.toggleTodo.bind(this))
		this.view.bindEditTodo(this.editTodo.bind(this))

		/** Routage **/
		this.routes = ['all','active','done'];

		/** Routage **/
		window.addEventListener("load",this.routeChanged.bind(this));
		window.addEventListener("hashchange",this.routeChanged.bind(this));

	}

	routeChanged(){
		let route =  window.location.hash.replace(/^#\//,'');
			this.filter = this.routes.find( r => r === route) || 'all';
			this.filterTodoList();

		}


	filterTodoList () {
		let data = this.model.getTodos(this.filter).then(todo => {
			this.view.renderTodoList(todo.results)
			this.view.setFilterTabs(this.filter)
		});
	}

	addTodo(text)  {
		let todo = this.model.add(text)
		this.filterTodoList()
	}

	deleteTodo(id)  {
		this.model.delete(parseInt(id))
		this.filterTodoList()
	}

	toggleTodo(id)  {
		this.model.toggle(parseInt(id))
		this.filterTodoList()
	}

	editTodo(id, text)  {
		this.model.edit(parseInt(id),text)
		this.filterTodoList()
	}
}

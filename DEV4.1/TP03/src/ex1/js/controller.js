class   Controller  {
	constructor(view,model){
		this.view = view
		this.model = model

		this.loading = false
		this.lastSearch = null
		this.error = null
		this.results = []

		this.view.setLoading(false)
		this.view.bindSearch(this.search.bind(this))
	}
	reset() {
		this.loading = false
		this.error = null
		this.results = []
	}

	async search(searchMovie) {
		const movies = await this.model.getMovies(searchMovie);
		if (movies.Response === "True") {
			this.view.renderMessage(null);
			this.view.renderList(movies.Search);
		} else {
			let array = [];
			this.view.renderList(array);
			this.view.renderMessage(movies.Error);
		}
	}
}

export default Controller
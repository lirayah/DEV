let apiKey = '8eac595c'

let model = {
	getMovies(search){
		return fetch(`https://www.omdbapi.com/?apikey=${apiKey}&s=${search}`).then((response) => response.json() );
	}
}

export default model

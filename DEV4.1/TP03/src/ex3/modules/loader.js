class loader {
	div = null
	constructor(node){
		this.div = node
	}
	set(loading){
		if (loading)
			this.div.classList.add("is-loading")
		else
			this.div.classList.remove("is-loading")
	}
}


export default loader

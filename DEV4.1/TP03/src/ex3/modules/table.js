import debounce from './helpers'


class tableManager {
	tbody = null 
	props = ["intRank","strTeamBadge","strTeam","intPlayed","intWin","intDraw",
		"intLoss","intGoalsFor","intGoalsAgainst","intGoalDifference","intPoints"]
	sort = -1 // -1 ou 1
	teamSearch = ''  
	data = []  // données à afficher
	//
	constructor(tbodyNode){
		this.tbody = tbodyNode


		document
			.getElementById("myInput")
			.addEventListener("input",debounce(e=>{
			this.teamSearch = e.target.value.toUpperCase()
			this.tableRender()
			},500))

		document
			.getElementById("sort")
			.addEventListener("click",((e) => {
				this.sort *= -1
				e.preventDefault()
				this.tableRender()

			}))

	}
	setData(data){
		this.data = data
	}
	_setDate = (()=>{
		if (this.data.length == 0 ) return
		let date=new Date(this.data[0].dateUpdated)
		document.getElementById("date").textContent = date.toLocaleDateString("fr")
	})

	setNom(nom){
		document.getElementById("nom").textContent = nom	
	}
	_getRow = (v => {
		let tr = document.createElement("tr")
		for (let p of this.props){
			let td = document.createElement("td")
			if (p !== "strTeamBadge"){
				td.textContent = v[p]
			} else {
				let figure = document.createElement("figure")
				let img = document.createElement("img")
				figure.classList.add("image","is-32x32")
				img.src = v[p]
				figure.appendChild(img)
				td.appendChild(figure)
			}
			tr.appendChild(td)
		}
		return tr
	})

	tableRender(){
		let dataFilter 
		if (this.teamSearch) 
			dataFilter = this.data.filter( item => item.strTeam.toUpperCase().includes(this.teamSearch))
		else
			dataFilter = [...this.data]

		dataFilter.sort((eq1,eq2)=>this.sort*(eq2.intRank - eq1.intRank))
		this._setDate()

		let content = document.createDocumentFragment()
		dataFilter.forEach(v =>{
			content.appendChild(this._getRow(v))
		})

		this.tbody.replaceChildren(content)
	}
}

export { tableManager }



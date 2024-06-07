import {tableManager} from './modules/table'
import loader from './modules/loader' 
let leagues = []

let leagueList = document.querySelector(".menu-list")
let table  = new tableManager(document.querySelector("table tbody"))
let loader = new loader(document.getElementById("loader"))

// TODO

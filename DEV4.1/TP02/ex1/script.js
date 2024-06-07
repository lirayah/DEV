// window.onload = function aaaaaaaaa() {
//     let tbody = document.querySelector('table tbody');
//     data.forEach(equipe => {
//         let tr = document.createElement('tr');
//         for(i in equipe){
//             let td = document.createElement('td')
//             switch (i) {
//                 case "intRank":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "strTeamBadge":
//                     a = document.createElement("img");
//                     a.src = equipe[i]
//                     td.appendChild(a);
//                     break;
//                 case "strTeam":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intPlayed":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intWin":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intDraw":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intLoss":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intGoalsFor":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intGoalsAgainst":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intGoalDifference":
//                     td.innerHTML = equipe[i];
//                     break;
//                 case "intPoints":
//                     td.innerHTML = equipe[i];
//                     break;
//                 default:
//                     break;
//             }
//             if (td.innerHTML !== "") {
//                 tr.appendChild(td);
//             }
//         }
//         tbody.appendChild(tr);
//     });
// }
debounce = (f,time) => {
    let timer = null;
    return function (...args){
        clearTimeout(timer);
        timer = setTimeout(() => f(...args), time);
    }
}


renderTable = (standings,mountPoint,keys) => {
    let frag = document.createDocumentFragment();
    for (team of standings){
        let tr = document.createElement('tr');
        for (attribut of keys){
            let td = document.createElement('td');
            let value = null;
            if (attribut === "strTeamBadge"){
                value = document.createElement("img");
                value.src = team[attribut];
            } else {
                value = document.createTextNode(team[attribut]);
            }
            td.append(value);
            tr.append(td);
        }
        frag.append(tr);
    }
    mountPoint.replaceChildren(frag);
}

filterAndSort = (data,sort,filterTeam) =>{
    return data.
        filter(team => team.strTeam.toLowerCase().includes(filterTeam.toLowerCase()))
        .sort((teamA,teamB) => (teamA.intRank - teamB.intRank) * sort)
}

window.onload = () =>{
    let sort = 1;
    let filterTeam = "";

    let tbody = document.querySelector('table tbody');
    let keys = ["intRank","strTeamBadge","strTeam","intPlayed","intWin","intLoss",
        "intDraw","intGoalsFor","intGoalsAgainst","intGoalDifference","intPoints"];
    
    document.getElementById("sort").addEventListener("click",(e) => {
        e.preventDefault();
        sort = sort * -1;
        renderTable(filterAndSort(data,sort,filterTeam),tbody,keys)
    });

    document.getElementById("myInput").addEventListener("input",debounce((e)=>{
        filterTeam = e.target.value;
        renderTable(filterAndSort(data,sort,filterTeam),tbody,keys)
    },500));

    renderTable(filterAndSort(data,sort,filterTeam),tbody,keys)
}
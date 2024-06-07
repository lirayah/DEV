import render from "./modules/langton-renderer-canvas2d";
import Ant from "./modules/Ant.js";


const options = {
	antStateColors : ['red','yellow'],
	tileStateColors : ['white','black'],
	tileSize : 10 
};


// For the view

const STEP_INTERVAL = 5; 
const BTN_AUTOPLAY_ID = 'autoplay';
const BTN_NEXT_MOVE_ID = 'next-move';
const MOVE_VAL_ID = 'move-value';
const BTN_PLUS_100_ID = 'plus-100';
const RESET = 'reset';



let autoplayInterval;
let canvas = document.querySelector("canvas");


canvas.width = window.innerWidth ;
canvas.height = window.innerHeight;

let ant = new Ant(Math.floor(canvas.width / options.tileSize),Math.floor(canvas.height/options.tileSize));

document.getElementById(BTN_AUTOPLAY_ID).addEventListener('click', () => {
	if (autoplayInterval) {
		return
	}

	autoplayInterval = setInterval(() => {
		ant.moveForward();
		updateView(ant,canvas,options);
	}, 100);
});


document.getElementById(BTN_PLUS_100_ID).addEventListener('click', () => {
	if (autoplayInterval) {
		clearInterval(autoplayInterval);
		autoplayInterval = null;
	}
	for (let i = 0; i < 100; i++) {
		ant.moveForward();
	}
	updateView(ant,canvas,options);
});

document.getElementById(BTN_NEXT_MOVE_ID).addEventListener('click', () => {
	if (autoplayInterval) {
		clearInterval(autoplayInterval);
		autoplayInterval = null;
	}
	ant.moveForward();
	updateView(ant,canvas,options)
})

document.getElementById(RESET).addEventListener('click', ()=>{
	if (autoplayInterval) {
		clearInterval(autoplayInterval);
		autoplayInterval = null;
	}
	ant = new Ant(Math.floor(canvas.width / options.tileSize),Math.floor(canvas.height/options.tileSize));
	updateView(ant,canvas,options)

});

function updateView(ant,canvas,options)
{
	document.getElementById(MOVE_VAL_ID).textContent = `${ant.move}`;
	render(ant,canvas,options);
}


updateView(ant,canvas,options)

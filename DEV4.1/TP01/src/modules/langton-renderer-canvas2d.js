/**
 * render - renders the universe to a 2D canvas.
 *
 * @param langtonsAnt - the universe.
 * @param canvas - The 2D canvas.
 * @param options - The rendering options (all optional).
 * @returns {undefined} - Nothing is returned.
 */

function render(langtonsAnt, canvas, options) {

	//  Grab our options.
	const {
		tileStateColors,
		antStateColors,
		tileSize
	} = options;


	//  Drawing style.
	const backgroundColor = '#FFFFFF';

	//  Size constants.
	const w = canvas.width;
	const h = canvas.height;

	//  Bounds constants.
	const gridSizeW = langtonsAnt.tiles.length;
	const gridSizeH = langtonsAnt.tiles[0].length;

	//  We're going to draw each square with a given edge size

	const tileSizeW = tileSize//w / gridSizeW ;
	const tileSizeH = tileSize //h / gridSizeH ;

	//  Get the drawing context.
	var ctx = canvas.getContext('2d');

	//  Clear the background.
	ctx.fillStyle = backgroundColor;
	ctx.fillRect(0, 0, w, h);

	//  Draw the grid.
	ctx.strokeStyle='#00000011';
	for (let x = 0; x <= gridSizeW; x++) {
		ctx.beginPath();
		ctx.moveTo(x * tileSizeW , 0);
		ctx.lineTo(x * tileSizeW , h);
		ctx.closePath();
		ctx.stroke();
	}
	for (let y = 0 ; y <= gridSizeH; y++) {
		ctx.beginPath();
		ctx.moveTo(0, y * tileSizeH);
		ctx.lineTo(w, y * tileSizeH);
		ctx.closePath();
		ctx.stroke();
	}


	//  Start drawing those tiles.
	langtonsAnt.tiles.forEach((tileRow,i) => {
		tileRow.forEach((tile,j)=>{

			//  Get the tile state index.

			//  Skip state zero tiles (i.e. white tiles)
			if (tile !== 0) {
				//  Set the tile colour, defaulting to grey if it is not set.
				ctx.fillStyle = tileStateColors[tile] || '#CCCCCC';
				ctx.fillRect(i * tileSizeW + 1, j * tileSizeH +1, tileSizeW - 1, tileSizeH - 1);
			}

		})
	})


	//  Draw the ant.
	var antX = langtonsAnt.x * tileSizeW,
		antY = langtonsAnt.y * tileSizeH;
	const antState = langtonsAnt.state;

	ctx.fillStyle = antStateColors[antState];
	//  Tranform before we draw the ant, it makes it easier.
	//
	ctx.save();
	ctx.translate(antX + tileSizeW/2, antY+tileSizeH/2);
	ctx.rotate((langtonsAnt.direction / 180) * Math.PI);
	ctx.beginPath();
	ctx.moveTo(-tileSizeW/2, -tileSizeH/2);
	ctx.lineTo(tileSizeW/2, 0);
	ctx.lineTo(-tileSizeW/2, tileSizeH/2);
	ctx.fill();
	ctx.closePath();
	ctx.restore();
}


export default render;

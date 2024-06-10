class Ant {
	x = 0; // position
	y = 0;
	move = 0;

	w = 0; // universe dimensions
	h = 0;

	direction = 0; // 0 90 180 270
	state = 0;
	tiles = null;

	antState = 0;

	constructor (w,h)
	{
		this.tiles = new Array(w).fill(null);
		this.tiles.forEach((el,i) => this.tiles[i] = new Array(h).fill(0));
		this.w = w;
		this.h = h;
		this.x = Math.floor(w/2);
		this.y = Math.floor(h/2);
	}

	moveForward() 
	{
		switch (this.direction) {
			case 0:
				this.x = ((this.x + 1) + this.w) % this.w;
				break
			case 90:
				this.y = ((this.y + 1) + this.h) % this.h;
				break
			case 180:
				this.x = ((this.x - 1) + this.w) % this.w;
				break
			case 270:
				this.y = ((this.y -  1) + this.h) % this.h;
				break
		}
		this.move ++;
		this.computeNextState();
	}

	rotateRight() {
		this.direction = (this.direction + 90)%360;
	}

	rotateLeft() {
		this.direction = (this.direction - 90 + 360)%360;
	}

	computeNextState()	
	{
		if (this.tiles[this.x][this.y]===0) {
			this.tiles[this.x][this.y]=1;
			if (this.antState === 0) {
				this.antState += 1;
			}
			this.rotateRight();
		} else {
			this.tiles[this.x][this.y]=0;
			if (this.antState === 1) {
				this.antState += 1;
			}
			this.rotateLeft();
		}
	}
}

export default Ant;

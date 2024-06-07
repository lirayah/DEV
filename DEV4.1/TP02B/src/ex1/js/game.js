var click = 0;
var started = false;

start = (btn, meme,cookie,score)=>{
    cookie.addEventListener("click",(e)=>{
        if (started === true){
            click++;
            score.innerHTML = click.toString();
        }
    })
    btn.addEventListener("click",(e)=>{
        started = true;
        click = 0;
        score.innerHTML = click.toString();
        meme.classList = "visible";
        let baseTime = 5;
        let spanMeme = document.getElementById("timer")
        timer(baseTime,spanMeme);
        setTimeout(() => {
            started = false;
            meme.classList = "hidden";
            console.log(click);
        }, baseTime*1000);
    })
}

window.onload = () =>{
    let btn = document.querySelector("button");
    let meme = document.querySelector("p");
    let cookie = document.querySelector("figure");
    var score = document.getElementById("score");
    start(btn,meme,cookie,score);
}

timer = (baseTime,spanMeme) =>{
    spanMeme.innerHTML = `${baseTime} seconds left!`;
    spanMeme.style.color = "red";
    spanMeme.style.position = "sticky";
    spanMeme.style.bottom = "100%";
    baseTime--;
    setTimeout(() => {
        if(baseTime > 0) timer(baseTime,spanMeme);
    }, 1000);
}
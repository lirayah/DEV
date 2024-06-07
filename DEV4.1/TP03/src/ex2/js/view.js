class View{
    constructor(){
        this.content = document.querySelector('.content');
        this.limit = document.querySelector("#limit");
        console.log(this.limit.selectedOptions);
    }
    


    bindLimit(handler){
        this.limit.addEventListener("change",()=>{
            handler(this)
        });
    }

    renderView(characters,limit){
        
    }
}

export default View;
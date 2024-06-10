class Controller {
    constructor(view, model){
        this.view = view;
        this.model = model;
    }

    async search(){
        const characters = this.view.getCharacters();
        this.view.renderView(characters);
    }
}

export default Controller;
let model = {
    limit: 6,

    getCharacters(){
        return fetch('https://thronesapi.com/api/v2/Characters').then((response) => response.json());
    },

    getLimit(){
        return this.limit;
    },

    setLimit(limit){
        this.limit = limit;
    },
}

export default model;
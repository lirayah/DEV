public class Arbre{
	private NoeudUser root;
	
	public void put(User valeur){
		NoeudUser node = new NoeudUser(valeur);
		if(this.root == null)
			this.root = node;
		else{
			NoeudUser courant = this.root;
			while(true){
				//Je ne sais pas comment faire pour comparer la "taille" de 2 user parce que je sais que ce n'est pas vraiment un dictionnaire ce que j'ai fait...
			}
	}
	
	public getLast(){
	}
	
	public int size(){
		this.root.size();
	}

	public User lastKey(){
		return this.root.lastKey();
	}
}

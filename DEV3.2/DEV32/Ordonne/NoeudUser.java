public class NoeudUser<K,V>{
	private User valeur;
	private NoeudUser lower;
	private NoeudUser higher;
	
	public NoeudUser(User valeur){
		this.valeur = valeur;
	}
	
	public NoeudUser getLower(){
		return this.lower;
	}
	
	public NoeudUser getHigher(){
		return this.higher;
	}

	public int size(){
		int i;
		if(this.lower != null){
			i = this.lower.size()+1;
		}
		if(this.higher != null){
			i = this.higher.size()+1;
		}
		return i;
	}

	public User lastKey(){
		User haut = null;
		if(this.higher != null)
			haut = this.higher.lastKey();
		if(haut != null)
			return haut;
		return this.valeur;
	}
}

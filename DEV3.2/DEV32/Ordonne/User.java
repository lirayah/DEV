public class User{
	private String username;
	private String password;
	
	public class User(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public void getUsername(){
		return this.username;
	}
	
	public void getPassword(){
		return this.password;
	}
}
package MavenApplication.model;

public class Login {
	private String username;
	private String userpassword;
	public Login(String username, String userpassword) {
		super();
		this.username = username;
		this.userpassword = userpassword;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpassword() {
		return userpassword;
	}
	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}
	
	

}

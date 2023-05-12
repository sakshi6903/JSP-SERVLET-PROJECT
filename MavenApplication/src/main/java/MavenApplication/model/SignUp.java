package MavenApplication.model;

public class SignUp {
	private String username;
	private String email;
	private String phoneno;
	private String password;
	private int accBal;
	public SignUp(String username, String email, String phoneno, String password, int accBal) {
		super();
		this.username = username;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.accBal = accBal;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAccBal() {
		return accBal;
	}
	public void setAccBal(int accBal) {
		this.accBal = accBal;
	}
	
	
	
	
}

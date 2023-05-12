package MavenApplication.model;

import java.sql.Timestamp;

public class Recharge {
	private String userName;
    private String phoneNumber;
    private int amount;
    private String serviceProvider;
	public Recharge(String userName, String phoneNumber, int amount, String serviceProvider) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.amount = amount;
		this.serviceProvider = serviceProvider;
	}
	public Recharge(String userName2) {
		// TODO Auto-generated constructor stub
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	
}

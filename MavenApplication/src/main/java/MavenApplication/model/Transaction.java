package MavenApplication.model;

import java.sql.Timestamp;

public class Transaction {

	private String userName;
    private String phoneNumber;
    private int amount;
    private String serviceProvider;
    private Timestamp transactionDate;
	public Transaction(String userName, String phoneNumber, int amount, String serviceProvider,
			Timestamp transactionDate) {
		super();
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.amount = amount;
		this.serviceProvider = serviceProvider;
		this.transactionDate = transactionDate;
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
	public Timestamp getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Timestamp transactionDate) {
		this.transactionDate = transactionDate;
	}
    
    
}

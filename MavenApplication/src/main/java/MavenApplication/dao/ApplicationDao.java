package MavenApplication.dao;

import java.sql.Statement;
import java.util.List;

import MavenApplication.model.Login;
import MavenApplication.model.Recharge;
import MavenApplication.model.SignUp;
import MavenApplication.model.Transaction;


public interface ApplicationDao {

	public int create(List<SignUp> lst);
	public List<SignUp>display();
	public String validateUser(Login lobj);
	public int saveRecharge(Recharge rec);
	public List<Transaction> statement(String username);
	
}

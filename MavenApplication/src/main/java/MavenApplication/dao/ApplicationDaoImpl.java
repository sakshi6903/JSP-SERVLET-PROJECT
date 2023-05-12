package MavenApplication.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import MavenApplication.model.SignUp;
import MavenApplication.model.Transaction;
import MavenApplication.model.Login;
import MavenApplication.model.Recharge;
import MavenApplication.db.DbConnection;

public class ApplicationDaoImpl implements ApplicationDao {

	@Override
	public int create(List<SignUp> lst) {
		int i=0;
		DbConnection db=new DbConnection();
		Connection con=db.myConnection();


		SignUp obj=lst.get(0);
		lst=null;
		try {
			PreparedStatement pstate=con.prepareStatement("insert into customer values(?,?,?,?,?)");
			pstate.setString(1,obj.getUsername());
			pstate.setString(2,obj.getEmail());
			pstate.setString(3,obj.getPhoneno());
			pstate.setString(4,obj.getPassword());
			pstate.setInt(5,obj.getAccBal());
			i=pstate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) {
			System.out.println("Record Save");
		}
		return i;
	}


	@Override
	public List<SignUp> display() {
		List<SignUp> lsrrec=new ArrayList<SignUp>(); 

		DbConnection dbobj=new DbConnection();
		Connection con =dbobj.myConnection();
		String query = "SELECT * FROM customer";

		try (
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(query)) {

			while (rs.next()) {
				SignUp robj=new SignUp(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				lsrrec.add(robj);
			}

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return lsrrec;
	}

	@Override
	public String validateUser(Login lobj){

		System.out.println(lobj.getUsername()+"\t"+lobj.getUserpassword());
		String str=null;
		List<SignUp> lstall=null;
		lstall=display();

		for(SignUp r:lstall) {

			if(r.getUsername().equals(lobj.getUsername())) {
				if(r.getPassword().equals(lobj.getUserpassword())) {
					str="valid";
					break;
				}
				else
				{
					str="invalid password";
				}
			}
			else {
				str="invalid username";
			}
		}
		return str;

	}


	@Override
	public int saveRecharge(Recharge rec) {
		int rowsAffected = 0;
		DbConnection db = new DbConnection();
		Connection conn = db.myConnection();
		String query = "INSERT INTO transaction (userName ,phoneNumber, amount, serviceProvider) VALUES (? , ?, ?, ?)";

		try (PreparedStatement pstmt = conn.prepareStatement(query)) {
			pstmt.setString(1,rec.getUserName());
			pstmt.setString(2, rec.getPhoneNumber());
			pstmt.setDouble(3,rec.getAmount());
			pstmt.setString(4,rec.getServiceProvider());

			rowsAffected = pstmt.executeUpdate();
			
			query = "UPDATE customer SET accBal = accBal - ? WHERE username = ?";
	        try (PreparedStatement pstmt2 = conn.prepareStatement(query)) {
	            pstmt2.setDouble(1, rec.getAmount());
	            pstmt2.setString(2, rec.getUserName());
	            pstmt2.setString(3, rec.getPhoneNumber());
	            pstmt2.executeUpdate();
	        }
		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		return rowsAffected;
	}

//	@Override
//	public List<Transaction> statment(){
//		
//		List<Transaction> stat=new ArrayList<Transaction>();
//		DbConnection dbobj=new DbConnection();
//		Connection con =dbobj.myConnection();
//	    String query = "SELECT * FROM transaction";  
//	    try (
//		         Statement stmt = con.createStatement();
//		         ResultSet rs = stmt.executeQuery(query)) {
//
//		        while (rs.next()) {
//		        	Transaction robj=new Transaction(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getTimestamp(5));
//		        	stat.add(robj);
//		        }
//		          
//
//		    } catch (SQLException ex) {
//		        ex.printStackTrace();
//		    }
//	    System.out.println("stst");
//		    return stat;
//		    
//	}
	
	@Override
	public List<Transaction> statement(String username){
	    List<Transaction> stat=new ArrayList<Transaction>();
	    DbConnection dbobj=new DbConnection();
	    Connection con =dbobj.myConnection();
	    String query = "SELECT * FROM transaction WHERE userName=?";  
	    try (PreparedStatement pstmt = con.prepareStatement(query)) {
	        pstmt.setString(1, username);
	        ResultSet rs = pstmt.executeQuery();

	        while (rs.next()) {
	            Transaction robj=new Transaction(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getTimestamp(5));
	            stat.add(robj);
	        }
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	    }
	    System.out.println("stst");
	    return stat;
	}

	
}


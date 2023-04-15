package p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class Signup extends ActionSupport {
	
	private String username, password, paymethod, shipping;
	User user;
	
	public Signup() {
		
	}
	
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/estore", "root", "root");
	}
	
	public String processSignup() throws Exception {
		String result = "";
		
		try {
		
			//check database
			         String sql = "INSERT into user (username, password, shipping, paymethod) VALUES (?, ?, ?, ?)";
			         PreparedStatement createUser = conn().prepareStatement(sql);
			         createUser.setString(1, username);
			         createUser.setString(2, password);
			         createUser.setString(3, shipping);
			         createUser.setString(4, paymethod);
			         int rowsUpdated = createUser.executeUpdate();
			         result = "login";

					createUser.close();
						
		} catch (Exception e) {
			e.printStackTrace();
		}
						
			//if username is in database, keep them here
			//result = "signup";
		return result;	
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

}

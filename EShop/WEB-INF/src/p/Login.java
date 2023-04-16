package p;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;

public class Login extends ActionSupport {
	
	private String username, password, paymethod, shipping;
	User user;
	
	public Login() {
		
	}
	
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/estore", "root", "root");
	}
	
	public String processLogin() throws Exception {
		String result = "login";
		
			try {
			//check database
		         String sql = "SELECT * FROM user WHERE username = ? AND password = ? AND shipping = ? AND paymethod = ?";
		         PreparedStatement ps = conn().prepareStatement(sql);
		         ps.setString(1, username);
		         ps.setString(2, password);
		         ps.setString(3, shipping);
		         ps.setString(4, paymethod);
		         ResultSet rs = ps.executeQuery();

		         
		         result = "tasks";
		         ps.close();
		         
				} catch (Exception e) {
					e.printStackTrace();
				}
		            
			
			//if username not in database, keep them here
			//result = "login";
			//if username is in database, move to tasks page
			//result = "tasks";
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

	public String getPaymethod() {
		return paymethod;
	}

	public void setPaymethod(String paymethod) {
		this.paymethod = paymethod;
	}

	public String getShipping() {
		return shipping;
	}

	public void setShipping(String shipping) {
		this.shipping = shipping;
	}

}


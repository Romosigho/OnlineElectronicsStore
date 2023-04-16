package p;

import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin extends ActionSupport {
	private String username, password;
	
	public Admin() {
		
	}
	
	public static Connection conn() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/estore", "root", "root");
	}
	
	public String processADLogin() throws Exception {
		String result = "adlogin";
		
			try {
			//check database
		         String sql = "SELECT * FROM admin WHERE username = ? AND password = ?";
		         PreparedStatement ps = conn().prepareStatement(sql);
		         ps.setString(1, username);
		         ps.setString(2, password);
		         ResultSet rs = ps.executeQuery();

		         
		         result = "adtasks";
		         ps.close();
		         
				} catch (Exception e) {
					e.printStackTrace();
				}
		            
		return result;	
	}
	
	//admin only puts in username + password
	//admin table in database

}

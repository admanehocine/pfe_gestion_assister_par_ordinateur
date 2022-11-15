package add;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class connexion {
	Connection conn=null;
	public static Connection connecter() {
		try {Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2","root","admanehocine1998");
		
		return conn;
		
		
			
		}catch(Exception e) {
		JOptionPane.showMessageDialog(null, e);
		return null;
		}
	}
	

}

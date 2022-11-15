import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class connexion {
	Connection conn=null;
	public static Connection connecter() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/pfe2?useSSL=false","root","amINe123");
		    System.out.println("Connected to DataBase !");
		return conn;
		}catch(Exception e){
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}

}

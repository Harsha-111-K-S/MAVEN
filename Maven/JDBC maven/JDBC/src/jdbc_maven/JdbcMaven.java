package jdbc_maven;

import java.sql.Connection;
import java.sql.DriverManager;



public class JdbcMaven {
	public static void main(String[] args) {
		try {
		String driver="com.mysql.cj.jdbc.Driver";
		String url= "jdbc:mysql://localhost:3306/test";
		String username="root";
		String password="";
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println("Connection sucessful");
		}
		
	
		catch(Exception e) {
			e.printStackTrace();
		}

    }
}

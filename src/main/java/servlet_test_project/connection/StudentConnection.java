package servlet_test_project.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentConnection {
	public static Connection getStudentConnection() {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc-3pm","root","Kamran007");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

}

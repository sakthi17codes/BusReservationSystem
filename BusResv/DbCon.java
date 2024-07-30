package BusResv;
import java.sql.*;

import java.sql.DriverManager;

public class DbCon {

	
		// TODO Auto-generated method stub
		private static final String url="jdbc:mysql://localhost:3306/busresv";
		private static final String username="root";
		private static final String password="Jdbc@sql24";
		
		public static Connection getConnection() throws SQLException{
			return DriverManager.getConnection(url,username,password);
		}


}

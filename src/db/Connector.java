package db;

import java.sql.*;

public class Connector {
	Connection con;
	Statement st;
	
	public Connector() {
		try {
			con =DriverManager.getConnection("jdbc:mysql://localhost/onlinefurnitureshop", "root", "root");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String query) throws SQLException {
		return st.executeQuery(query);
	}
	
	public int executeUpdate(String query) throws SQLException {
		return st.executeUpdate(query);
	}
	
	public static void main(String args[]) {
		Connector c = new Connector();
	}
}

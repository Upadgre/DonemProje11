package src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class bagla {
	static Connection myConn;
	static Statement myState;
	static ResultSet myRs;
	static ResultSet yap() {
		try {
			myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonuc","root","1234");
			myState=myConn.createStatement();
			myRs = myState.executeQuery("SELECT * FROM puan1");
			return myRs;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return myRs;
	}
	static void ekle(String sql_sorgu) throws SQLException {
		myState.executeUpdate(sql_sorgu);
	}
	static void update(String sql_sorgu) throws SQLException {
		myState.executeUpdate(sql_sorgu);
	}
	static ResultSet bul(String sql) throws SQLException {
		ResultSet myRs=null;
		myConn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sonuc","root","1234");
		myState=myConn.createStatement();
		myRs = myState.executeQuery(sql);
		return myRs;
	}

}

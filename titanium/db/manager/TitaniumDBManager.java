package com.titanium.db.manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TitaniumDBManager {
	public static Connection connect() throws SQLException {
		String addr = "jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(addr, "BS","1234");
		
	}
	
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs){
		try {
			rs.close();				//C,U,D때는 필요없고, R때만 필요
									// insert하게되면 NullpointException이 발생
									// 모든 Exception 이 잡히도록 할것!
		} catch (Exception e) {		//메세지는 안보려고!
		
		}
		try {
			pstmt.close();
		} catch (Exception e) {
		
		}
		try {
			con.close();
		} catch (Exception e) {
		
		}
	}
}

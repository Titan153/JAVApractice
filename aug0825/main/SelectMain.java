package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectMain {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(addr, "BS", "1234");
			
			// 상품 이름을 오름차순으로 정렬해서 상품 전체 정보를 조회
			String sql = "SELECT * FROM PRODUCT ORDER BY P_NAME";
			
			pstmt = con.prepareStatement(sql);

			
			// pstmt.excuteUpdate(): 몇 개나 영향을 받았는가 (C,U,D)
			// PSTMT.excuteQuery(): 데이터 (R)
			
			// select문을 수행한 결과: ReasultSet
			//     List와 비슷한 느낌
			
			rs = pstmt.executeQuery();
			
			// rs.next() : 다음 데이터로 넘어감
			// 			 	다음 데이터가 있으면 true,
			//				다음 데이터가 없으면 false가 리턴
			while (rs.next()) {
				// rs.getXXX("컬럼명") : 현재 위치의 컬럼 읽기 //XXX는 자료형
				// rs.getXXX(인덱스) : 비추 // 헷갈림,  다른사람들은 모름
				System.out.println(rs.getString(2));
				System.out.println(rs.getString("P_WEIGHT"));
				System.out.println(rs.getString("P_PRICE"));
				System.out.println("------------------");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		try {
			con.close(); // close 철저히
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}	
		
		
	} // main
} // class

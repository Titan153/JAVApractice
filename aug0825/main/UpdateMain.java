package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateMain {
	public static void main(String[] args) {
		//매장명 입력 => 그 단어를 포함하는 모든 매장의 상품을 20% 할인된 가격으로 바꾸기
		// UPDATE VEGETABLE
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(addr, "BS", "1234");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("매장명: ");
			String name = sc.next();
			
			sc.close();
			String sql = "UPDATE VEGETABLE SET V_PRICE = V_PRICE * 0.8"+ 
						 "WHERE V_S_NO IN"+ "(SELECT S_NO FROM V_STORE " 
						 					+ "WHERE S_NAME LIKE '%'||?||'%')";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, name);
			
			int dataCount = pstmt.executeUpdate();
			if (dataCount >= 1) {
				System.out.println("Delete Success !");
			} else {
				System.out.println("존재하지않습니다.");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			pstmt.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		try {
			con.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}

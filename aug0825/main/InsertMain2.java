package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain2 {
	public static void main(String[] args) {
		// 연결
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			//연결
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			con = DriverManager.getConnection(addr, "BS", "1234");
			
			// 연결이 되면 마켓 정보들 입력 받기(Scanner)
			Scanner sc = new Scanner(System.in);
			System.out.print("마트 이름: ");
			String name = sc.next();
			
			System.out.print("지점명: ");
			String location = sc.next();
			
			System.out.print("평수: ");
			int land = sc.nextInt();
			
			System.out.println("주차 가능 대수: ");
			int parking = sc.nextInt();
			
			sc.close();
			// SQL => market 테이블에 넣을 것 
			// Java 변수에 있는 값 들어갈 자리에는 '?'로
			String sql = "INSERT INTO MARKET"+ " VALUES(MARKET_SEQ.NEXTVAL,"
						+"?,?,?,?)";
			
			pstmt = con.prepareStatement(sql);
			
			// ?에 값 채우기 : pstmt.setXXX(물음표 번호, 값)
			// XXX: 자료형, 물음표 번호는 1부터 시작!!!
			// SQL => market 테이블에 넣을 것 
			pstmt.setString(1, name);
			pstmt.setString(2, location);
			pstmt.setInt(3, land);
			pstmt.setInt(4, parking);
			
			//전송/실행/결과 받기 
			int dataCount = pstmt.executeUpdate();
			// INSERT INTO 로 넣은 데이터 1개
			// 성공메세지
			if (dataCount == 1) {
				System.out.println("Success !");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			pstmt.close(); 		//닫는 순서 주의!! (con.close()보다 먼저 닫기!)
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		
		try {
			con.close(); // close 철저히
			
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	
		
	}//main
}// class

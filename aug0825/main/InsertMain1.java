package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain1 {
	public static void main(String[] args) {
		// SQL문을 사용해서
		// 		=> DB 서버로 전송
		// 		=> DB 서버에서 실행해서
		//      => 그 결과를 받아올 수 있어야
		Connection con = null;
		try {
			// 연결할 DB서버 주소 (메이커별로 형식이 다르다)
			// Data Source Explorer - 서버 이름쪽에서 오른쪽 마우스 버튼 클릭 -
			// Properties _- Driver Properties - Connection URL값을 복사
			
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(addr, "BS", "1234");
											// DB주소 , ID ,     PW
			
			// 주의할 점 2가지!
			String sql = "INSERT INTO PRODUCT " +  //1. 띄어쓰기 주의!! //VEGEVALUES 가 되버릴수도 있음
						" VALUES(PRODUCT_SEQ.NEXTVAL,"+
						"'테스트', 10 ,10 ,3 )"; //2. SQL 문장 마지막에 ';' 쓰지 말것!
			
			// 서버에 전송/실행/결과 받아오는 작업을 하는 총괄 매니저
			PreparedStatement pstmt = con.prepareStatement(sql);
			//pstmt.executeUpdate(); // 서버에 전송/실행/결과 받기
			
			// 서버에 전송/실행/결과 받기
			// 위의 작업때문에 영향을 받은 데이터의 수가 리턴
			int dataCount = pstmt.executeUpdate();
			// INSERT INTO 로 넣은 데이터 1개
			if (dataCount == 1) {
				System.out.println("Success !");
			}
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	
		try {
			con.close(); // close 철저히
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}// main
}

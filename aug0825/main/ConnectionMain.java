package com.titanium.aug0825.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 원래: cmd기반 sqlplus라는 프로그램으로 OracleDB제어 
// 		 cmd기반 불편
// 사제품 : eclipse, sqldeveloper

// Socket 통신 (양방향 통신) -> Node 에서 ~
// HTTP 통신

// DB서버와 통신 : Java에 내장되어 있음 (미완성상태)
//     DB 메이커가 많기 때문에... => 메이커 별로 통신이 조금씩 달라서
//		연결할 DB에 맞춰서 조금씩 손을 봐줘야...

// JDBC (Java DataBase Connectivity) - 자바에서 DB 프로그래밍을 하기 위해 사용하는 API
//  OracleDB 사용중 => 그 기능은 ojdbc8.jar에 다 있음

// 이 프로젝트에 ojdbc8.jar 넣기
// jdbc:oracle:thin:@localhost:1521:xe
public class ConnectionMain {
	public static void main(String[] args) {
		Connection con = null;
		
		try {
			// 연결할 DB서버 주소 (메이커별로 형식이 다르다)
			// Data Source Explorer - 서버 이름쪽에서 오른쪽 마우스 버튼 클릭 -
			// Properties _- Driver Properties - Connection URL값을 복사
			
			String addr = "jdbc:oracle:thin:@localhost:1521:xe";
			
			con = DriverManager.getConnection(addr, "BS", "1234");
											// DB주소 , ID ,     PW
			
				System.out.println("Success ! ");
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
}// class

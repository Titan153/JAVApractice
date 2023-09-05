package com.titanium.aug252.manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import com.titanium.aug252.reservation.Reservation;
import com.titanium.aug252.restaurant.Restaurant;
import com.titanium.db.manager.TitaniumDBManager;

//DAO / DTO패턴
//스프링 MVC패턴의 M(모델)
//DAO(Data Access Object)
//			:M중에서 DB관련한 작업을 전담하는 클래스
//DTO(Data Transfer / Temp Object)
//			:DAO의 작업결과를 표현하는 클래스

//java.util.Date - 주력(Spring에서는 이걸 원함)
//java.sql.Date - JDBC에서는 이걸 원함

//java.util.Date => java.sql.Date
//			: new Date(클래스명.get날짜관련멤버변수명().getTime());

//java.sql.Data => java.util.Date : 알아서 바꿔줌

public class DAO {
	// 1.예약하기(직접 입력, 날짜는 연-월-일/시:분) //Create(insert)
	public static String book(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = TitaniumDBManager.connect();
			String sql = "insert into reservation values(reservation_seq.nextval, ?, ?, ?, ?)";

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			pstmt.setDate(2, new Date(rsv.getWhen().getTime()));
			pstmt.setString(3, rsv.getPhone());
			pstmt.setString(4, rsv.getLocation());

			if (pstmt.executeUpdate() == 1) {//row값이 들어있으면 int : row count 반환
				return "예약 성공";
			}
			return "";// java문법상 필요해서 억지로 넣었음
		} catch (Exception e) {
			e.printStackTrace();
			return "예약 실패";
		} finally {//finally문은 항상실행
			TitaniumDBManager.close(con, pstmt, null);
		}
	}

	// 2.매장을 등록(지점명, 지점장, 좌석수) //Create(insert)
	public static String registerRst(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = TitaniumDBManager.connect();
			String sql = "insert into restaurant values(? ,? ,?)";//지점명, 지점장, 좌석수
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, rst.getLocation());//setNString
			pstmt.setNString(2, rst.getOwner());//setNString
			pstmt.setInt(3, rst.getSeat());//setInt setN 이랑 무슨차이지

			if (pstmt.executeUpdate() == 1) {
				return "매장 등록 성공";
			}
			return "";
		} catch (Exception e) {
			e.printStackTrace();
			return "매장 등록 실패";
		} finally {
			TitaniumDBManager.close(con, pstmt, null);
		}
	}

	// 3.전체 예약 확인(날짜는 연-월-일 요일 오전/오후 시:분) //Read
	public static ArrayList<Reservation> getAllReserve() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = TitaniumDBManager.connect();
			String sql = "select * from reservation order by r_no";
			pstmt = con.prepareStatement(sql);

			rs = pstmt.executeQuery();

			ArrayList<Reservation> rsvs = new ArrayList<Reservation>();

			Reservation r = null;
			while (rs.next()) {
				r = new Reservation();
				r.setNo(rs.getInt("r_no"));
				r.setName(rs.getString("r_name"));
				r.setWhen(rs.getDate("r_time"));
				r.setPhone(rs.getString("r_phonenum"));
				r.setLocation(rs.getString("r_location"));
				rsvs.add(r);
			}
			return rsvs;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} finally {
			TitaniumDBManager.close(con, pstmt, rs);
		}
	}

	// 4.전체 매장 조회(위치(좌석 수)-사장님 이름) //Read
	public static ArrayList<Restaurant> getAllRestaurant() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = TitaniumDBManager.connect();
			String sql = "select * from restaurant order by r_location";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();

			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			while (rs.next()) {
				rsts.add(new Restaurant(rs.getString("r_location"), 
						rs.getString("r_owner"), rs.getInt("r_seat")));
			}
			return rsts;

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		} finally {
			TitaniumDBManager.close(con, pstmt, rs);
		}

	}

	// 5.매장 찾기(조회) (최소 좌석 수 입력) => 좌석 수 이상의 매장 정보 출력) //Read
	public static ArrayList<Restaurant> showSearchRstMenu(Restaurant rst) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = TitaniumDBManager.connect();
			String sql = "select * from restaurant where r_seat >= ? order by r_location";

			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, rst.getSeat());
			rs = pstmt.executeQuery();

			ArrayList<Restaurant> rsts = new ArrayList<Restaurant>();
			while (rs.next()) {
				rsts.add(new Restaurant(rs.getString("r_location"), 
						rs.getString("r_owner"), rs.getInt("r_seat")));

			}
			return rsts;
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}
	// 6.예약 찾기(예약자의 이름으로) //Read
	public static ArrayList<Reservation> searchReserve(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con = TitaniumDBManager.connect();
			String sql = "select * from reservation "
					+ "where r_name like '%'||?||'%'"
					+ "order by r_no";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getName());
			rs = pstmt.executeQuery();
			
			ArrayList<Reservation>rsvs = new ArrayList<Reservation>();
			while(rs.next()) {
				rsvs.add(new Reservation(rs.getInt("r_no"), rs.getString("r_name")
						,rs.getDate("r_time"),rs.getString("r_phonenum")
						,rs.getString("r_location")));
			}
			return rsvs;
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}finally {
			TitaniumDBManager.close(con, pstmt, rs);
		}
	}
	// 7.예약 정보 수정(예약번호를 입력하면, 연락처를 변경) //Update
	public static String updateReserve(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con= TitaniumDBManager.connect();
			String sql = "update reservation set r_phonenum = ? where r_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, rsv.getPhone());
			pstmt.setInt(2, rsv.getNo());
			
			if(pstmt.executeUpdate()==1) {
				return "예약수정 성공";
			}
			return "예약정보 없음";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "예약수정 실패";
		}finally {
			TitaniumDBManager.close(con, pstmt, null);
		}
	}
	// 8.예약 취소(예약 번호로 취소) //Delete
	public static String deleteReserve(Reservation rsv) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con=TitaniumDBManager.connect();
			String sql = "delete from reservation where r_no = ?";
		    pstmt = con.prepareStatement(sql);
		    pstmt.setInt(1, rsv.getNo());
		    
		    if(pstmt.executeUpdate()==1){
		    	return "예약취소 성공";
		    }
		    return "예약정보 없음";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "예약정보 실패";
		}finally {
			TitaniumDBManager.close(con, pstmt, null);
		}
	}
	// 9.종료

}// class end

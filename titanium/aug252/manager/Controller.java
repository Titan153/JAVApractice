package com.titanium.aug252.manager;

import java.util.ArrayList;
import java.util.Scanner;

import com.titanium.aug252.reservation.Reservation;
import com.titanium.aug252.restaurant.Restaurant;

//MVC의 C(컨트롤)
//if(번호 == 1 ){
//	consolescreen.예약하기 기능(입력);
//	dao.db관련 예약기능(insert);
//	결과보여주기(성공or실패);
//}

public class Controller {
	public static void main(String[] args) {
		int menu = 0;
		String result = null;
		Reservation rsv = null;
		Restaurant rst = null;
		ArrayList<Reservation> rsvResult = null;
		ArrayList<Restaurant> rstResult = null;
		
		
		System.out.println("<< 예약 프로그램>>");
		while (true) {
			try {
				menu = ConsoleScreen.showMainMenu();
				if(menu == 9) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}else if(menu==1) {
					rsv = ConsoleScreen.showRsvMenu();
					result = DAO.book(rsv);
					ConsoleScreen.printResult(result);
				}else if(menu==2) {
					rst=ConsoleScreen.showRstMenu();
					result = DAO.registerRst(rst);
				}else if(menu==3) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResultMenu(rsvResult);
				}else if(menu==4) {
					rstResult = DAO.getAllRestaurant();
					ConsoleScreen.showRstResultMenu(rstResult);
				}else if(menu==5) {
					rst = ConsoleScreen.showSearchRstMenu();
					rstResult= DAO.showSearchRstMenu(rst);
					ConsoleScreen.showRstResultMenu(rstResult);
				}else if(menu==6) {
					rsv = ConsoleScreen.showSearchRsvMenu();
					rsvResult = DAO.searchReserve(rsv);
					ConsoleScreen.showRsvResultMenu(rsvResult);
				}else if(menu==7) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResultMenu(rsvResult);
					
					rsv = ConsoleScreen.showUpdateRsvMenu();
					result = DAO.updateReserve(rsv);
					ConsoleScreen.printResult(result);
					
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResultMenu(rsvResult);
				}else if(menu==8) {
					rsvResult = DAO.getAllReserve();
					ConsoleScreen.showRsvResultMenu(rsvResult);
					
					rsv = ConsoleScreen.showDeleteRsvMenu();
					result = DAO.deleteReserve(rsv);
					ConsoleScreen.printResult(result);
					
				}
			} catch (Exception e) {
				e.printStackTrace();	
			}
		}//while end
		
		
		
	}//main end
}//class end

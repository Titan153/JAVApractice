package com.titanium.aug162.main;

import java.io.InputStream;
import java.util.Calendar;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

//미세먼지 =>파싱 =>값들을=>txt파일에 담기
//(프로그램 실행시) 날짜,측정구,미세먼지,오존,통합대기환경지수
//날짜형식 : 연-월-일-오전/오후-시-요일
//각각 수치 단위x


public class AirPollutionMain2 {
	public static void main(String[] args) {
		
		try {
			String address = "http://openAPI.seoul.go.kr:8088"
					+ "/4f626857416f6c6c3632586a416843"
					+ "/xml"
					+ "/RealtimeCityAir"
					+ "/1"
					+ "/25"
					+ "/";
			InputStream is = TitaniumHttpClient.download(address);
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			
			String tagName = null;
			
			Calendar now = Calendar.getInstance();
			
			int year = now.get(Calendar.YEAR);
			int month = now.get(Calendar.MONTH);
			int day = now.get(Calendar.DAY_OF_MONTH);
			int week = now.get(Calendar.DAY_OF_WEEK);
			String strWeek = null;
			switch(week) {
			case Calendar.MONDAY: strWeek = "월";break;
			case Calendar.TUESDAY: strWeek = "화";break;
			case Calendar.WEDNESDAY: strWeek = "수";break;
			case Calendar.THURSDAY: strWeek = "목";break;
			case Calendar.FRIDAY: strWeek = "금";break;
			case Calendar.SATURDAY: strWeek = "토";break;
			default:				strWeek = "일";
			}
			
			int amPm = now.get(Calendar.AM_PM);
			String strAmPm = null;
			if(amPm == Calendar.AM_PM) {
				strAmPm = "오전";
			}else {
				strAmPm = "오후";
			}
			
			int hour = now.get(Calendar.HOUR);
			int minute = now.get(Calendar.MINUTE);
			int second = now.get(Calendar.SECOND);
			System.out.print(year + "년 ");
			System.out.print(month + "월 ");
			System.out.print(day + "일 ");
			System.out.print(strAmPm + " ");
			System.out.print(hour + "시 ");
			System.out.print(strWeek + "요일 \n");
			System.out.println("-----------------");
			System.out.printf("%d년 %d월 %d일 %s %s시 %s요일\n",year,month,day,strAmPm,hour,strWeek);
			
			while(type != XmlPullParser.END_DOCUMENT) {
				if(type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if(type == XmlPullParser.TEXT) {
					if(tagName.equals("MSRSTE_NM")) {
						System.out.printf("측정 구 : %s\n", xpp.getText());
					}else if(tagName.equals("PM10")) {
						System.out.printf("미세먼지 : %s\n", xpp.getText());
					}else if(tagName.equals("PM25")) {
						System.out.printf("초미세먼지 : %s\n", xpp.getText());
					}else if(tagName.equals("O3")) {
						System.out.printf("오존 : %s\n", xpp.getText());
					}else if(tagName.equals("IDEX_MVL")) {
						System.out.printf("통합대기질환경지수 : %s\n", xpp.getText());
					}System.out.printf("%d년 %d월 %d일 %s %s시 %s요일\n",year,month,day,strAmPm,hour,strWeek);
				}else if(type == XmlPullParser.END_TAG) {
					tagName = "";
					
				}
				
				xpp.next();
				type = xpp.getEventType();
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}

}

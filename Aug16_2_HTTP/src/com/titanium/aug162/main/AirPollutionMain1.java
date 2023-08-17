package com.titanium.aug162.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

//웹 서버(클라이언트 가 웹사이트에 요청 => 사이트가 응답)
//실시간 데이터를 XML Parsing(클라이언트가 데이터를 요청 => XML/JSON 응답)
//	(나중에)그 데이터를 가지고 웹으로 이미지화 시켜서 구현
//	data.go.kr
//	data.seoul.go.kr
//	dev.naver.com
// 	dev.kakao.com
//	...

//서울 열린데이터 광장 DB - 미세먼지 데이터

//DB에 있는 데이터를 사람들에게 보여줘야 하는 경우...
//	대부분의 사람들이 SQL을 할 줄 모름..
//	웹사이트 : 사람들이 DB쓰기 편하게

//	개발자가 데이터만 가져오고 싶음
//	데이터를 특정한 형식으로 표현해줘야 하는데
// 	DB에 있는 데이터를 표현하는 형식 : XML, JSON

//	Parsing - kxm12.jar
//	필요없는 데이터는 걷어내고, 원하는 형태로 가공하는 작업

//	XML(eXtensible Mark-up Language)
//	DB에 있는 데이터를 HTML 형태로 표현한 것
// <xxx>		: 시작태그(xxx : 태그명)
// 		yyy		: 텍스트
//</xxx>		: 종료태그

//서울데이터광장 강사님 인증키
//4f626857416f6c6c3632586a416843
//http://openAPI.seoul.go.kr:8088/4f626857416f6c6c3632586a416843/xml/RealtimeCityAir/1/25/

//인증키 + 주소값 활용해서
//main메소드에 저 주소에 요청한 데이터들 전부다 출력
//자동 줄정리 ctrl + shift + F

public class AirPollutionMain1 {
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
//		String result = TitaniumHttpClient.convert(is, "UTF-8");
//		System.out.println(result);
		
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			//START_DOCUMENT : 문서의 시작
			//END_DOCUMENT : 문서의 끝
			//START_TAG : 시작태그(<xxx>)
			//END_TAG : 종료태그(</xxx>)
			//TEXT : 텍스트(시작태그와 종료태그 사이의 내용)
			
			String tagName = null;
			
			while(type != XmlPullParser.END_DOCUMENT) {
				if(type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if(type == XmlPullParser.TEXT) {
					if(tagName.equals("MSRSTE_NM")) {
						System.out.printf("측정 구 : %s\n",xpp.getText());
					}else if(tagName.equals("MSRDT")) {
						System.out.printf("측정일시 : %s\n",xpp.getText());
					}else if(tagName.equals("PM10")) {
						System.out.printf("미세먼지 : %s(㎍/㎥)\n",xpp.getText());
					}else if(tagName.equals("PM25")) {
						System.out.printf("초미세먼지 : %s(㎍/㎥)\n",xpp.getText());
						System.out.println("----------------");
					}
				}else if(type == XmlPullParser.END_TAG) {
					tagName = "";//XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있음
				}
				xpp.next();
				type = xpp.getEventType();//다음 태그의 값을 가짐
				
			}
			
		} catch (Exception e) {
		e.printStackTrace();
		}
	}
}

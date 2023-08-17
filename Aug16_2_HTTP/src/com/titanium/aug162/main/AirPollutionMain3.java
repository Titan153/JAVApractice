package com.titanium.aug162.main;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

public class AirPollutionMain3 {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream("C:\\test\\AirPoll.txt");
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
			
			Date now = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-a-hh-E");
			String nowStr = sdf.format(now);
			
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
						bw.write(nowStr + ",");
						bw.write(xpp.getText() + ",");
					}else if(tagName.equals("PM10")) {
						bw.write(xpp.getText() + ",");
					}else if(tagName.equals("PM25")) {
						bw.write(xpp.getText() + ",");
					}else if(tagName.equals("03")) {
						bw.write(xpp.getText() + ",");
					}else if(tagName.equals("IDEX_MVL")) {
						bw.write(xpp.getText() + "\r\n");
						bw.flush();
					}
				}else if(type == XmlPullParser.END_TAG) {
					tagName = "";//XML에서는 띄어쓰기를 텍스트로 인식하는 경우가 있음
				}
				xpp.next();
				type = xpp.getEventType();//다음 태그의 값을 가짐
				
			}
			System.out.println("파일 생성 완료(확인용)");
		} catch (Exception e) {
		e.printStackTrace();
		}
		try {
			fos.close();
		} catch (Exception e) {
			
		}
	}
	
}

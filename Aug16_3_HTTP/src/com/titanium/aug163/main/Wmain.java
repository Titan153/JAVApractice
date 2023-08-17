package com.titanium.aug163.main;

import java.io.InputStream;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

public class Wmain {
	public static void main(String[] args) {
		
		try {
			String address = "https://www.weather.go.kr"
					+ "/w"
					+ "/rss"
					+ "/dfs"
					+ "/hr1-forecast.do?zone=1111061500";
			InputStream is = TitaniumHttpClient.download(address);
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			
			String tagName = null;
			
			while(type != XmlPullParser.END_DOCUMENT) {
				if(type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
				}else if(type == XmlPullParser.TEXT) {
					if(tagName.equals("pubDate")) {
						System.out.printf("시간: %s ", xpp.getText());
					}else if(tagName.equals("hour")) {
						System.out.printf("%s시\n", xpp.getText());
					}else if(tagName.equals("day")) {
						System.out.printf("%s시\n", xpp.getText());
					
					
					}else if(tagName.equals("sky")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("pty")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("wfKor")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("wfEn")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("pop")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("ws")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("wd")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("wdKor")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("WdEn")) {
						System.out.printf("%s\n", xpp.getText());
					}else if(tagName.equals("reh")) {
						System.out.printf("%s\n", xpp.getText());
					}
				}else if(type == XmlPullParser.END_TAG) {
					tagName = "";
				}
				xpp.next();
				type = xpp.getEventType();
			}
			
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	
	}
// https://www.weather.go.kr/w/rss/dfs/hr1-forecast.do?zone=1111061500
}

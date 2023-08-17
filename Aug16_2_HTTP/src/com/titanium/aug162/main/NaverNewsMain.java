package com.titanium.aug162.main;

import java.io.InputStream;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

//		Client ID      9BabCr32rCtde18e4sjz
//		Client Secret  Y_kE7xsucJ

//https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&
//query=%EA%B8%B0%EC%95%84%ED%83%80%EC%9D%B4%EA%B1%B0%EC%A6%88

//인터넷 주소 체계
//프로토콜 :// - 통신방식
//  컴퓨터의 주소/
//	폴더명/폴더명/.../파일명
//	?(물음표) 다음에 나오는
//			변수명 = 값&변수명=값&...
//				요청 파라미터 : 클라이언트가 서버에게 공개적으로 전달할 정보

//	한글, 특수문자가 바로 들어가서는 안됨!!
//		ex)기아타이거즈 => %EA%B8%B0%EC%95%84%ED%83%80%EC%9D%B4%EA%B1%B0%EC%A6%88(URL 인코딩)

public class NaverNewsMain {
	public static void main(String[] args) {
		//https://openapi.naver.com/v1/search/news.xml	
		try {
			Scanner k = new Scanner(System.in);
			System.out.print("검색어: ");
			String search = k.next();
			System.out.println(search);
			search = URLEncoder.encode(search, "UTF-8");
			System.out.println(search);
			
			String address = "https://openapi.naver.com/v1/search/news.xml";
			address += "?query=" + search;
			
//			InputStream is = TitaniumHttpClient.download(address);
			//HttpsURLConnection 활용 =>안에 있는 기능
//			URL u = new URL(address);
//			HttpsURLConnection huc = (HttpsURLConnection)u.openConnection();
//			
//			//요청헤더
//			huc.addRequestProperty("X-Naver-Client-Id","9BabCr32rCtde18e4sjz"  );
//			huc.addRequestProperty("X-Naver-Client-Secret","Y_kE7xsucJ");
//			
//			InputStream is = huc.getInputStream();
//			
//			String result = TitaniumHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
//////////////////////////////////////////////////////////////////////
			HashMap<String, String>headers = new HashMap<String, String>();
			headers.put("X-Naver-Client-Id","9BabCr32rCtde18e4sjz");
			headers.put("X-Naver-Client-Secret","Y_kE7xsucJ");
			InputStream is = TitaniumHttpClient.download(address, headers);
//			String result = TitaniumHttpClient.convert(is, "UTF-8");
//			System.out.println(result);
			
			//뉴스의 title / description
			//title : Naver Open API - news - ?
			//description : Naver Search Result
			//	=>안나오게
			
			XmlPullParserFactory xppf = XmlPullParserFactory.newInstance();
			XmlPullParser xpp = xppf.newPullParser();
			xpp.setInput(is, "UTF-8");
			
			int type = xpp.getEventType();
			String tagName = null;
			boolean data = false;
			String t = null;
			
			while(type != XmlPullParser.END_DOCUMENT) {
				if(type == XmlPullParser.START_TAG) {
					tagName = xpp.getName();
					if(tagName.equals("item")) {
						data = true;
					}
				}else if(type == XmlPullParser.TEXT) {
					if (data) {
						if (tagName.equals("title")) {
							t = xpp.getText();
							t = t.replaceAll("[<b>,</b>,&quot;,&apos;,&amp;]","");
							System.out.printf("제목 : %s\n",t);
						}else if(tagName.equals("description")) {
							t = xpp.getText();
							t = t.replace("<b>","");
							t = t.replace("</b>","");
							t = t.replace("&quot;","");
							t = t.replace("&apos;","");
							t = t.replace("&amp;","&");
							
							System.out.printf("내용 : %s\n", t);
							System.out.println("=======================");
						}
						
					}
				}else if (type == XmlPullParser.END_TAG) {
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

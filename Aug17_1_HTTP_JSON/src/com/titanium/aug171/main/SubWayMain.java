package com.titanium.aug171.main;

import java.io.InputStream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

//AJAX - JavaScirpt를 사용해서 통신, 클라이언트와 서버간에 XML형식의 데이터를 주고받는 기술!
//		=> XML 많이 안쓰이는 추세
//		=> Javascript에 조금 더 친화된 형태가 없을까???

//JSON(JavaScript Object Notation)
//		DB에 있는 데이터를 JavaScript형태로 표현한 것
//		XML형태 보다도 훨씬 좋다(압도적으로)

//Java 배열 : {1, 2, 3}
//JS 배열 : [1, 2, 3]
//Java 객체 : Dog d = new Dog();
//				d.setName("강아지");
//				d.setAge(3);
//JS 객체 : {name : "강아지", age : 3}

//4f626857416f6c6c3632586a416843
//http://openapi.seoul.go.kr:8088/(인증키)/json/TbSeoulmetroStOrigin/1/275/

public class SubWayMain {
	public static void main(String[] args) {

		try {
			String address = "http://openapi.seoul.go.kr:8088" + "/4f626857416f6c6c3632586a416843" + "/json"
					+ "/TbSeoulmetroStOrigin" + "/1" + "/275/";
			InputStream is = TitaniumHttpClient.download(address);
			String str = TitaniumHttpClient.convert(is, "UTF-8");
//		System.out.println(str);

			JSONParser jp = new JSONParser();

			JSONObject jo = (JSONObject) jp.parse(str);
//		System.out.println(jo);
			JSONObject metro = (JSONObject) jo.get("TbSeoulmetroStOrigin");
//		System.out.println(metro);

			JSONArray row = (JSONArray) metro.get("row");
//		System.out.println(row);

			JSONObject data = null;
			for (int i = 0; i < row.size(); i++) {
				data = (JSONObject) row.get(i);
				System.out.println(data.get("STATION_NAME"));
				System.out.println(data.get("LINE"));
				System.out.println(data.get("ORIGIN"));
				System.out.println("=======================");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}

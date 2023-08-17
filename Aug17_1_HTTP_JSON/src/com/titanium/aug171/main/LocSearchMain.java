package com.titanium.aug171.main;

import java.io.InputStream;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.titanium.http.client.TitaniumHttpClient;

//REST API 키값 : 72a1aeb093b6502d5b6271057abbbb52
//37.570176!4d126.983197!

public class LocSearchMain {
	public static void main(String[] args) {
		try {
			
			Scanner k = new Scanner(System.in);
			System.out.println("검색 : ");
			String search = k.next();
			search=URLEncoder.encode(search,"UTF-8");
//			System.out.println(search);
			
			String address = "https://dapi.kakao.com/v2/local/search/keyword.json";
			address += "?query="+search;
//			37.570176!4d126.983197!
			address += "&x=126.841909&y=37.568105";//좌표설정
			address += "&radius=5000";
			address += "&sort=distance";
			
			//72a1aeb093b6502d5b6271057abbbb52
			//Authorization: KakaoAK ${REST_API_KEY}
			
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("Authorization","KakaoAK 72a1aeb093b6502d5b6271057abbbb52");
			InputStream is = TitaniumHttpClient.download(address, headers);
			String str = TitaniumHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			JSONObject jo = (JSONObject)jp.parse(str);
			//총 검색 결과 수
			JSONObject jo2 = (JSONObject)jo.get("meta");
			System.out.printf("총 검색 결과 수 : %s개\n",jo2.get("total_count"));
			//현재 페이지 결과수
			System.out.printf("현재 페이지 결과 수: %s개\n", jo2.get("pageable_count"));
			System.out.println("---------------------------------");
			
			JSONArray ja = (JSONArray) jo.get("documents");
			JSONObject jo3 = null;
			for(int i = 0; i < ja.size();i++) {
				jo3 = (JSONObject)ja.get(i);
				//주소
				System.out.printf("주소 : %s\n",jo3.get("address_name"));
				//전화번호
				System.out.printf("전화번호 : %s\n",jo3.get("phone"));
				//상호명
				System.out.printf("상호명 : %s\n",jo3.get("place_name"));
				//기준점과의 거리
				System.out.printf("거리 : %sm\n",jo3.get("distance"));
				//를 출력
				System.out.println("----------------------------");
			}
						
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//기준전 주변 반경 5km이내에 검색한 키워드(입력)가 포함된 가게들을
	//거리기준으로 정렬 출력

}

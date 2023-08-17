package com.titanium.aug171.main;

import java.io.InputStream;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.titanium.http.client.TitaniumHttpClient;

public class WeatherMain {
	public static void main(String[] args) {
		//https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}
		//https://api.openweathermap.org/data/2.5/weather?q=seoul&appid=42008a8c8e7402a3fc9d3b1a7df8fee9
		//&units=metric&lang=kr
		//도시이름 : Scanner로 입력!(영어로! + 도시이름!)
		//appid : 42008a8c8e7402a3fc9d3b1a7df8fee9
		
		//나라 이름
		//도시 이름
		//description
		//기온 : main.temp
		//체감온도 : main.feels_like
		//최저기온 : main.temp_min
		//최고기온 : main.temp_max
		//기압 : main.sea_level, main.grnd_level
		//습도 : main.humidity
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("City: ");
			String city = sc.next();
			
			
			String address = "https://api.openweathermap.org/data/2.5/weather";
			address += "?q=" + city;
			address += "&appid=42008a8c8e7402a3fc9d3b1a7df8fee9";
			address += "&units=metric";
			address += "&lang=kr";//description을 한국어로
//			System.out.println(address);
			
			InputStream is = TitaniumHttpClient.download(address);
			String str = TitaniumHttpClient.convert(is, "UTF-8");
//			System.out.println(str);
			
			JSONParser jp = new JSONParser();
			
			JSONObject jo = (JSONObject)jp.parse(str);
			//나라이름
			JSONObject sys = (JSONObject)jo.get("sys");
			String country = (String)sys.get("country");
			System.out.println(country);
			//도시이름
			String cityName = (String)jo.get("name");
			System.out.println(cityName);
			//description
			JSONArray ja = (JSONArray)jo.get("weather");
			JSONObject jo2 = (JSONObject)ja.get(0);
			String description = (String)jo2.get("description");
			System.out.println(description);
			
			//기온 : main.temp
			JSONObject main = (JSONObject)jo.get("main");
			double temp = (double)main.get("temp");
			System.out.println(temp);
			//체감온도 : main.feels_like
			double feelslike = (double)main.get("feels_like");
			System.out.println(feelslike);
			//최저기온 : main.temp_min
			double tempMin = (double)main.get("temp_min");
			System.out.println(tempMin);
			//최고기온 : main.temp_max
			double tempMax = (double)main.get("temp_max");
			System.out.println(tempMax);
			//기압 : main.sea_level, main.grnd_level
			long pressure = (long)main.get("pressure");
			System.out.println(pressure);
			//습도 : main.humidity
			long humidity = (long)main.get("humidity");
			System.out.println(humidity);
			
//			JSONParser jp = new JSONParser();
//			JSONObject jo = (JSONObject) jp.parse(str);
//			JSONObject main = (JSONObject) jo.get("main");
//			System.out.println("기온: " + main.get("temp"));
//			System.out.println("체감온도: " + main.get("feels_like"));
//			System.out.println("최저기온: " + main.get("temp_min"));
//			System.out.println("최저기온: " + main.get("temp_max"));
//			System.out.println("기압: " + main.get("sea_level")+main.get("grnd_level"));
//			System.out.println("습도: " + main.get("humidity"));
//			System.out.println(jo);
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		
	}
}

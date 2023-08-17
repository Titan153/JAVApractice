package com.titanium.aug161.client;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;

import org.xmlpull.v1.XmlPullParserFactory;

import com.titanium.http.client.TitaniumHttpClient;

public class HMain {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		
		try {
			String address = "https://www.naver.com/";
			InputStream is = TitaniumHttpClient.download(address);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

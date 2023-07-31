package oop20230713;

public class For3star8 {

	public static void main(String[] args) {
		
		//목표
		//*****
		//****
		//***
		//**
		//*
		//**
		//***
		//****
		//*****
		
		for(int i=0; i<5; i++) {
			for(int j=5; j>i; j--) {
				System.out.print("*");
			}
			for(int j=0; j<i; j++) {
				System.out.print("&");
			}
			System.out.println();	
		}
		
		for(int i=2; i<6; i++) {
			for(int j=0;j<i;j++ ) {
				System.out.print("*");
			}
			for(int j=5;j>i;j--) {
				System.out.print("&");
				}
			System.out.println();
		}
		

	}//main()end

}//class()end

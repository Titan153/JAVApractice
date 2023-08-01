package oop20230726;

import java.util.Scanner;

public class Goods {
	//필드
	String name;
	int price;
	int numberOfSold; 
	int numberOfStock;	
	//기본생성자↓
	public Goods() {
		
	}
	//생성자 오버로딩↓
	public Goods(String name, int price){
		this.name = "셀러리주스";
		this.price = 1;
		
	}
	//생성자 오버로딩↓
	public Goods(int price, int numberOfStock) {
		this.price = 2;
		this.numberOfStock = 20;
	}
	//메소드 생성↓
	public void inputGoods() {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 이름 : ");
		this.name = sc.next();
		System.out.println("상품 가격(만원) : ");
		this.price = sc.nextInt();
		System.out.println("판매 수량 : ");
		this.numberOfSold = sc.nextInt();
		System.out.println("재고 수량 : ");
		this.numberOfStock = sc.nextInt();
		sc.close();
	}
	//메소드 생성↓
	public void printGoods() {
		
		System.out.println("---[판매일지]---");
		System.out.printf("%d만원 %s 상품은 금일 %d개 판매 후,\n재고가 %d개 입니다.",this.price,this.name,this.numberOfSold,this.numberOfStock);
	}
	
	public static void main(String[] args) {
		// 클래스명(파일명) : Goods.java
		// Goods 클래스를 정의하시오.
		// 필드 : 상품이름 name
		// 필드 : 상품가격(만원) price
		// 필드 : 판매수량 numberOfSold
		// 필드 : 재고수량 numberOfStock
		// 생성자 오버로딩
		// 메소드 : 상품정보 입력 메소드 inputGoods()
		// 메소드 : 상품정보 출력 메소드 printGoods()
		// 클래스명(파일명) : GoodEx.java
		// GoodsEx 실행 클래스 작성해 보기
		/*[결과][예]
		상품 이름 :맥북프로14 (엔터)
		상품 가격(만원) : 260 (엔터)
		판매 수량 : 1 (엔터)
		재고 수량 : 5 (엔터)
		---[판매일지]---
		260만원 맥북프로14 상품은 금일 1개 판매 후,
		재고가 5개입니다.
		*/
		
		//객체생성
		Goods goods = new Goods();
		//메소드 사용
		goods.inputGoods();
		goods.printGoods();
		
	}//main()end

}//class()end

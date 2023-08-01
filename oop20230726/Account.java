package oop20230726;

public class Account {//클래스 정의
	//필드
	private String accId;	//계좌번호
	private String name;//이름
	private int balance;//잔액
	//생성자
	public Account(){	//기본 생성자
		this.accId = "100-01-1000";
		this.name = "고객명";
		this.balance = 0;
	}
	//생성자 오버로딩(Over Loading)
	public Account(String accId, String name) {//매개변수 생성자
		this.accId = accId;
		this.name = name;
		this.balance = 1;
	}
	public Account(String accId, String name, int balance) {//매개변수 생성자
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}
	//메서드
	
	public void deposit(int money) {//메서드 : 입금
		this.balance += money;
	}
	
	public void withdraw(int money) {//메서드 : 출금
		this.balance -= money;
	}
	
	
	public void showBalance() {//메서드 : 출력
		System.out.println("===계좌정보===");
		System.out.println("계좌번호 : " + this.accId);
		System.out.println("이름 : " + this.name);
		System.out.println("잔액 : " + this.balance);
	}
	
	
	public String getAccId() {
		return accId;
	}
	public void setAccId(String accId) {
		this.accId = accId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}//Account class end

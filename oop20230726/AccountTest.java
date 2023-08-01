package oop20230726;

public class AccountTest {//실행 클래스-> main() 메서드 포함

	public static void main(String[] args) {
		Account acc1 = new Account();
		Account acc2 = new Account("100-01-5678", "김철수");
		Account acc3 = new Account("100-01-2341", "홍길동", 100000);
		acc1.showBalance();
		acc1.showBalance();
		acc3.showBalance();
		
		acc2.setBalance(60000);
		acc2.showBalance();
		acc2.deposit(500);
		acc2.showBalance();
	

	}

}

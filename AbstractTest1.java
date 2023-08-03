package oop20230802;

import java.util.Scanner;

abstract class Employee{
	
	abstract int getPay();
	
}
class Permanent extends Employee{
	
	private String name;
	private int basicPay;
	private int bonus;
	
	@Override
	int getPay() {
		
		return getBasicPay() + getBonus();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getBonus() {
		return bonus;
	}
	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	public String toString() {
		return "고용형태 : 고용직(정규직)\n" +  "사원 : " + getName() + "\n급여 : " + getPay();
	}
	

}//class permanent end
class Temporary extends Employee{
	
	private String name;
	private int Hourpay;
	private int workTime;
	
	@Override
	int getPay() {
		
		return getHourpay() * getWorkTime();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHourpay() {
		return Hourpay;
	}
	public void setHourpay(int hourpay) {
		Hourpay = hourpay;
	}
	public int getWorkTime() {
		return workTime;
	}
	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}
	public String toString() {
		return "고용형태 : 임시직(아르바이트)\n" +  "사원 : " + getName() + "\n급여 : " + getPay();
	}
}//temporary class end
public class AbstractTest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("고용형태를 선택하시오(P: 고용직, T: 임시직) >");
		String PorT=sc.next();
		if(PorT.equals("p") || PorT.equals("p")) {
			Permanent per = new Permanent();
			System.out.println("이름: ");
			String name = sc.next();
			per.setName(name);
			System.out.println("기본급여: ");
			int basicpay = sc.nextInt();
			per.setBasicPay(basicpay);
			System.out.println("보너스: ");
			int bonus = sc.nextInt();
			per.setBonus(bonus);
			System.out.println("----------------");
			System.out.println(per.toString());
		}else {
			Temporary tem = new Temporary();
			System.out.println("이름: ");
			String name = sc.next();
			tem.setName(name);
			System.out.println("시간당급여: ");
			int hourpay = sc.nextInt();
			tem.setHourpay(hourpay);
			System.out.println("근무시간: ");
			int worktime = sc.nextInt();
			tem.setWorkTime(worktime);
			System.out.println("----------------");
			System.out.println(tem.toString());
		}
		sc.close();
		
	}

}

package oop20230726;

import java.util.Scanner;

class Human1{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Human 클래스 (부모 클래스)
	//이름, 나이
	//getter/setter 만들기
	
}
class Teacher1 extends Human1{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void work() {
		System.out.println("학생을 가르칩니다.");
	}
	//Teacher 클래스 (자식 클래스)
	//필드 : 과목
	//getter/setter 만들기
	//메서드 : 하는 일-work()
	//가르친다(System.out.println으로 가르친다는 내용을 화면 출력)	
	}
class Programmer1 extends Human1{
	private int career;

	public int getCareer() {
		return career;
	}

	public void setCareer(int career) {
		this.career = career;
	}
	public void work() {
		System.out.println("프로그래밍을 합니다.");
	}
	//Programmer (자식 클래스)
	//필드 : 개발경력
	//getter/setter 만들기
	//메서드 : 하는 일
	//프로그래밍한다.
}
public class HumanEx_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 나이, 과목을 입력하세요");
		Teacher1 teacher = new Teacher1();
		teacher.setName(sc.next());
		teacher.setAge(sc.nextInt());
		teacher.setSubject(sc.next());
		
		System.out.println("=====================");
		System.out.printf("이름: %s\n", teacher.getName());
		System.out.printf("나이: %d\n", teacher.getAge());
		System.out.printf("과목: %s\n", teacher.getSubject());
		teacher.work();
		System.out.println();
		
		Programmer1 programmer = new Programmer1();
		System.out.println("이름, 나이, 개발경력을 입력하세요");
		programmer.setName(sc.next());
		programmer.setAge(sc.nextInt());
		programmer.setCareer(sc.nextInt());
		
		System.out.println("=====================");
		System.out.printf("이름: %s\n", programmer.getName());
		System.out.printf("나이: %d\n", programmer.getAge());
		System.out.printf("개발경력: %d\n", programmer.getCareer());
		programmer.work();
		
	
		//HumanEx 클래스 
		//main()에서는
		
		//(1) 이름, 나이, 과목을 입력 받아
		//Teacher 객체 생성 후 값을 넣어준 후, 화면 출력 (getter/setter 이용)
		//하는 일 메서드 호출
		
		//(2) 이름, 나이, 개발경력을 입력 받아 처리
		//Programmer 객체 생성 후 처리	

	}

}

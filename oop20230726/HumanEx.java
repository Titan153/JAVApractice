package oop20230726;

import java.util.Scanner;

class Human{
	
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
class Teacher extends Human{
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void work() {
		System.out.println("가르치는 일을 합니다.");
		
	}
	//Teacher 클래스 (자식 클래스)
		//필드 : 과목
		//getter/setter 만들기
		//메서드 : 하는 일-work()
		//가르친다(System.out.println으로 가르친다는 내용을 화면 출력)​

}
class Programmer extends Human{
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
public class HumanEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름,나이,과목을 입력하세요.");
		Teacher teacher = new Teacher();
		String name = sc.next();
		teacher.setName(name);
		int age = sc.nextInt();
		teacher.setAge(age);
	    String subject = sc.next();
	    teacher.setSubject(subject);
	    
	    System.out.println("=======================");
	    System.out.printf("이름: %s\n",teacher.getName());
	    System.out.printf("나이: %d\n", teacher.getAge());
	    System.out.printf("과목: %s\n",teacher.getSubject());
	    teacher.work();
	    System.out.println();
	    
	    
	    System.out.println("이름,나이,개발경력(정수입력)을 입력 받아 처리");
	    Programmer programmer = new Programmer();
	    String name2 = sc.next();
	    programmer.setName(name2);
	    int age2 = sc.nextInt();
		programmer.setAge(age2);
		int career = sc.nextInt();
		programmer.setCareer(career);
		
		System.out.println("=======================");
		System.out.printf("이름: %s\n",programmer.getName());
	    System.out.printf("나이: %d\n", programmer.getAge());
	    System.out.printf("개발경력: %d년\n",programmer.getCareer());
	    programmer.work();
	    
	    sc.close();
		//HumanEx 클래스 
		//main()에서는
		
		//(1) 이름, 나이, 과목을 입력 받아
		//Teacher 객체 생성 후 값을 넣어준 후, 화면 출력 (getter/setter 이용)
		//하는 일 메서드 호출
		
		//(2) 이름, 나이, 개발경력을 입력 받아 처리
		//Programmer 객체 생성 후 처리	
		
	}
	
}

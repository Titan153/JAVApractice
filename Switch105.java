package oop20230712;

import java.util.Scanner;

public class Switch105 {

	public static void main(String[] args) {
		// case문에 문자열
		System.out.println("메달을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String medal = sc.next();
		
		switch (medal)	{
		case "Gold":
			System.out.println("금메달입니다.");
			break;
		case "Silver":
			System.out.println("은메달입니다.");
		case "Bronze":
			System.out.println("동메달입니다.");
			default:
				System.out.println("메달이 없습니다.");
				break;
		}
		sc.close();
	}//main()end

}//class()end

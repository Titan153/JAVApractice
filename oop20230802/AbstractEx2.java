package oop20230802;

abstract class ACalc{
	abstract int add(int a, int b);
}
class PCals extends ACalc {

	@Override
	int add(int a, int b) {
		
		return a + b;
	}
	int mul(int a, int b) {
		return a*b;
	}
	
}

public class AbstractEx2 {
	
	public static void main(String[] args) {
		PCals pc1 = new PCals();
		System.out.println(pc1.add(10, 20));
		System.out.println(pc1.mul(10, 20));
		
		ACalc ac1 = new PCals();
		System.out.println(ac1.add(50, 70));
//		System.out.println(ac1.mul(50,70));
	}

}

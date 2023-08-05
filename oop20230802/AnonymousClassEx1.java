package oop20230802;

interface IMessage{
	public abstract void msgPring();
}
class Message implements IMessage{

	@Override
	public void msgPring() {
		System.out.println("====Message 클래스====");
		
	}
	
}
public class AnonymousClassEx1 {
	public static void main(String[] args) {
		//익명(무명) 클래스(anonymous class)
		//필요한 곳에 일시적으로 사용하고 싶은 경우
		//이벤트
		//1)클래스/객체생성
		Message mess = new Message();
		mess.msgPring();
		//2)다형성
		IMessage msg = new Message();
		msg.msgPring();
		//3)익명 클래스
		//인터페이스와 추상클래스는 new 객체(인터페이스)생성 불가능하지만,
		//추상메서드를 오버라이딩하면,
		//"일시적으로" new 사용가능하다. (익명 클래스 사용 시)
		//IMessage message = new IMessage(); //(에러)
		IMessage message = new IMessage() {
			@Override
			public void msgPring() {
				System.out.println("===Anonymous 익명(내부, 임시)클래스===");

			}
		};
		message.msgPring();
	}//	main end
	
}//class end

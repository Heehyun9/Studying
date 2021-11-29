package day16;

class CC {
	@Override
	public String toString() {
		return "CC객체";
	}
}
class DD {
	@Override
	public String toString() {
		return "DD객체";
	}
}
public class Ex1606 {
	// 이해1. 타입 파라미터를 "리턴타입 앞"에 적는다.
	static <T,U> void display2(T param1, U param2) {
		System.out.println(param1);
		System.out.println(param2);
	}
	public static void main(String[] args) {
		CC cc = new CC();
		DD dd = new DD();
		display2(cc, dd);	// 이해2. 제네릭 메서드는, 메서드가 호출될 때에야 비로소
							// 각 타입 파라미터에 대응되는 클래스이름이 결정된다.
	}
}






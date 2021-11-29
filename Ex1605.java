package day16;

class AA {
	@Override
	public String toString() {
		return "AA객체";
	}
}
class BB {
	@Override
	public String toString() {
		return "BB객체";
	}
}
public class Ex1605 {
	static <T> void display(T param) {
		System.out.println(param);
	}
	public static void main(String[] args) {
		AA aa = new AA();
		BB bb = new BB();
		display(aa);
		display(bb);
		
		// 추가연습 : display() 메서드 정의문을 주석처리, 일반 메서드 오버로딩으로 변경.
	}
}






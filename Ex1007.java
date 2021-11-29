package day10;

class A5 { }
class B5 extends A5 { }

public class Ex1007 {
	public static void main(String[] args) {
		A5 obj = new B5();  // 부모타입의 참조변수가 자식타입의 객체를 가리킬 수 있음.
//		B5 obj2 = new A5();  // ERR.
		
	}
}

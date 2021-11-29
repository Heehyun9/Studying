package day11;

class A1 {
	void m1() { }
}
class B1 extends A1 {
	void m2() { }
}
public class Ex1101 {
	public static void main(String[] args) {
//		A1 obj = new A1();
//		B1 obj2 = new B1();
		
		// 다형성 : 참조변수의 타입을 부모클래스로 할 수 있음.
		//		  (부모클래스 타입의 참조변수가 자식클래스 객체를 참조할 수 있음.)
		
		A1 obj3 = new B1(); 	// 父-子
		//B1 obj4 = new A1();
		
		
	}
}








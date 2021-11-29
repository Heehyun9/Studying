package day11;

class A {
	void methodA() {
		System.out.println("메서드 methodA().");
	}
}
class B extends A {
	void methodB() {
		System.out.println("메서드 methodB().");
	}
}
public class Ex50 {
	public static void main(String[] args) {
		A obj = new B();
		obj.methodA();
//		obj.methodB();  // ERR. (이해)
	}
}









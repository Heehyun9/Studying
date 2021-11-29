package day10;

class A {
	int a;
	void showA() { System.out.println(a); }
}
class B extends A {
	int b;
	void showB() { System.out.println(b); }
}

public class Ex1002 {
	public static void main(String[] args) {
		B obj = new B();
		obj.a = 10;		// 자식클래스 B에는 a,b 둘 다 있음을 확인.
		obj.b = 20;
		obj.showA();	// 자식클래스 B에는 showA(), showB() 둘 다 있음을 확인.
		obj.showB();
	}
}





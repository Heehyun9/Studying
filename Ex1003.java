package day10;

class A2 {
	int a;
	void show() { System.out.println(a); }
}
class B2 extends A2 {		
	int b;					
	// "메서드 오버라이드(Override)" = "재정의"  // 자식클래스 입장에서 볼 때
										   // 부모클래스의 메서드 내용이 마음에 안 드는 것.
									 	   // 그래서 자식클래스 입장에서 메서드를 재정의!
	void show() {
		System.out.println("a:"+a+", b:"+b);
	}
	void show2() {
		super.show();     // 키워드 "super" : 자식클래스에서 쓰여,
						  //                부모클래스(객체) 그 자체를 의미함.
	}
}
public class Ex1003 {
	public static void main(String[] args) {
		B2 obj = new B2();
		obj.a = 100;
		obj.b = 200;
		obj.show();		// 부모클래스의 show() ? 자식클래스의 show() ?  (이해)
		obj.show2();
	}
}






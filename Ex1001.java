package day10;

class A1 {
	int a,b;
	int getSum() { return a+b; }
}
class B1 extends A1 {    // "extends 부모클래스" : 상속!
	
}

public class Ex1001 {
	public static void main(String[] args) {
		B1 obj = new B1();
		obj.a = 10;		// 상속->(B1에 a,b가 있음을 확인)
		obj.b = 20;
		System.out.println(obj.getSum());   // 상속->(B1에 getSum()도 있음을 확인)
	}
}








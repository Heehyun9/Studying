package day10;

class A3 {
	int num;
	A3(int num) { this.num = num; }
}
class B3 extends A3 {
	B3() { 
		super(0);	// 부모클래스의 생성자를 호출하는 표현.
	}
}
public class Ex1004 {
	public static void main(String[] args) {
		//A3 obj = new A3(100);
		B3 obj2 = new B3();
		System.out.println(obj2.num);    // 0
	}
}

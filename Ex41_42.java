package day10;

class Student2 {		// 학생
	void learn() { System.out.println("배운다"); }
	void run() { System.out.println("복도에서 뛰어다닌다"); }
	void sayHello() { System.out.println("선생님 안녕하세요~"); }
}
class Leader2 extends Student2 {	// 반장
	@Override
	void sayHello() {		// 부모클래스의 메서드를 재정의(Override)
		System.out.println("선생님께 인사!");
		super.sayHello();   // "선생님 안녕하세요~" (이해)
	}
}
public class Ex41_42 {
	public static void main(String[] args) {
		Leader2 obj = new Leader2();
		obj.run();
		obj.sayHello();
	}
}
// 추가 이해1 : @Override를 쓸 수 있음(Optional.)
// 추가 이해2 : 오버라이드 상황에서, super 키워드를 사용하면,
//			  부모클래스의 오버라이드 당한 메서드에 접근 가능하다.











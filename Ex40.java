package day10;

class Person {			// 부모클래스 : 3가지 메서드.
	void breath() { System.out.println("숨 쉰다"); }
	void eat() { System.out.println("먹는다"); }
	void say() { System.out.println("말한다"); }
}
class Student extends Person {	// 자식클래스1 : 4가지 메서드.
	void learn() { System.out.println("배운다"); }
}
class Teacher extends Person {	// 자식클래스2 : 4가지 메서드.
	void teach() { System.out.println("가르친다"); }
}
public class Ex40 {
	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		t.teach();
		s.learn();
		t.breath();
		s.eat();
	}
}






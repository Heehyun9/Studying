package day11;

/*final*/ class FinalClass {		// 상속이 불가능한 클래스.
	/* final */ int num = 5;      		// 상수.
}
class Parent extends FinalClass {
	/*final*/ void finalMethod() {  // 오버라이딩이 불가능한 메서드.
		System.out.println("finalMethod() 실행됨.");
	}
}
class Child extends Parent {
	void finalMethod() {
		System.out.println("재정의된 finalMethod() 실행됨.");
	}
}
public class Ex49 {
	public static void main(String[] args) {
		FinalClass fc = new FinalClass();
		fc.num = 55;
		
	}
}




package day11;

// Ex1102. 다형성(형 변환 / instanceof 연산자) -- 고급
//                (1)          (2)
// 선택 : (1)만 이해 / (1),(2) 둘 다 이해.
class A2 {
	void m1() { System.out.println("m1메서드 실행됨."); }
}
class B2 extends A2 {
	void m2() { System.out.println("m2메서드 실행됨."); }
}

public class Ex1102 {
	public static void main(String[] args) {
		A2 obj = new B2();
		obj.m1();
		//obj.m2();   // ERR. (1) 이해: 왜 안 안되는지?
		
		if(obj instanceof B2) {	// obj(객체)가 클래스 B2의 인스턴스인지?
								// --> 다형성의 개념이 여기에 적용될 수 있음.(고급)
								// --> 따라서, "obj가 B2 타입의 참조변수에 의해
								//           참조될 수 있는지?"
			((B2)obj).m2();
		}
		// "instanceof" : 그걸로 형 변환 할 수 있는지?
		// "(클래스이름)" : 그걸로 형 변환 실행!
	}
}






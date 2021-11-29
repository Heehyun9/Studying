package day9;

class BB {
	int n;	// 인스턴스변수
	static int n2 = 300;
	void showN() {	   // showN() : "인스턴스메서드" 
		System.out.println("인스턴스메서드 -> n : " + n);
		System.out.println("인스턴스메서드 -> n2 : " + n2);
	}
	static void showN2() {   // showN2() : "클래스메서드"
//		System.out.println("클래스메서드 -> n : " + n);    // ERR
		System.out.println("클래스메서드 -> n2 : " + n2);  // okay!
		// showN();   // ERR
	}
}

public class Ex902 {
	public static void main(String[] args) {
		BB bb1 = new BB();
		BB bb2 = new BB();
		
		bb1.n = 100;   bb2.n = 200;
		bb1.showN();    
		bb2.showN();
	}
}

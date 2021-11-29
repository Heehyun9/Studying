package day9;

// 이해 : 클래스 메서드 ---> 인스턴스 변수, 메서드에 접근이 불가능 !
class Check {
	static int cv=100;
	int iv=200;
	static void cm() { }
	void im() { }
	
	// 인 --> 인 : "인스턴스메서드에서 인스턴스멤버에 접근이 가능할까?"
	void imIm() { 
		iv = 300;	// 인스턴스변수에 접근 : 당연히 가능.
		im();		// 인스턴스메서드에 접근 : 당연히 가능.
	}
	
	// 클 --> 클
	static void cmCm() {
		cv = 400;	// 클래스변수에 접근 : 당연히 가능.
		cm();		// 클래스메서드에 접근 : 당연히 가능.
	}
	
	// 인 --> 클
	void imCm() {
		cv = 500;	// 클래스변수에 접근 : '공유'의 개념이니까 가능.
		cm();		// 클래스메서드에 접근 : '공유'의 개념이니가 가능.
	}
	
	// 클 --> 인
	static void cmIm() {
//		iv = 600;	// ERR. 인스턴스변수에 접근 : '애매하니까' 안 된다!
//		im();		// ERR. 인스턴스메서드에 접근 : '애매하니까' 안 된다!
	}
}
public class Ex37 {	
	public static void main(String[] args) {
		
	}
}


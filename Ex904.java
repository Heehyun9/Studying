package day9;

// 1. 개발자가 생성자를 작성하지 않으면, 자바컴파일러가 '디폴트생성자'를 자동으로 껴넣어준다.
// 2. 생성자도 오버로딩(파.개.타.)이 가능하다. 
class CC {
	int num;
//	CC() { }       // "default constructor (디폴트생성자)"
//	CC() { 
//		System.out.println("생성자#1이 실행됨");
//		num = 0;
//	}
//	CC(int n) {
//		System.out.println("생성자#2이 실행됨");
//		num = n;
//	}
}
public class Ex904 {
	public static void main(String[] args) {
		CC obj = new CC();    // 만약에, "new CC(100); -------> ERR."
					// 생성자 호출표현 : "CC()"
		System.out.println("obj.num : " + obj.num);
		System.out.println("프로그램 종료됨");
	}
}





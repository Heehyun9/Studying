package day10;

class AA {
	int num;

	// 생성자는 일종의 메서드이므로, 생성자도 '오버로딩'이 허용됨.
	// 오버로딩 : 파.개.타.
	AA() { 		// 생성자#1
		//num = 0;
		this(0);  // 생성자#2가 호출됨.
				// this() : 생성자 첫 줄에서 또다른 생성자를 호출하는 표현.
	}
	AA(int num) { 	// 생성자#2
		this.num = num; 
	}

	void show() {
		System.out.println("num : " + num);
	}
}
public class Ex1005 {
	public static void main(String[] args) {
		AA obj1 = new AA();  // ----> 생성자#1 호출됨.
		obj1.show();     // num : 0
		AA obj2 = new AA(55);	// ----> 생성자#2 호출됨.
		obj2.show();     // num : 55
	}
}




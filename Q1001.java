package day10;

class FourCalculator {
	int a, b, result;
	String op;         // "+", "-", "*", "/"
	
	static int count = 0;   // 총 연산횟수
	
	FourCalculator(int a, int b, String op) {
		this.a = a;
		this.b = b;
		this.op = op;
	}
	
	static void showManual() {
		System.out.println("+,-,*,/ 등의 사칙연산을 할 수 있는 계산기!");
	}
	
	void doCalc() {
		count++;	// 총 연산횟수 (count변수) 1 증가.
		switch(op) {			// switch() 괄호 안에, 정수, 문자열(Java1.7?~)
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			result = a / b;
			break;
		}
	}
}
public class Q1001 {
	public static void main(String[] args) {
		FourCalculator.showManual();
		FourCalculator fc1 = new FourCalculator(2,3,"+");
		FourCalculator fc2 = new FourCalculator(4,5,"-");
		FourCalculator fc3 = new FourCalculator(6,7,"*");
		fc1.doCalc();
		fc2.doCalc();
		fc3.doCalc();
		System.out.println("결과값 : " + fc1.result);	// 5
		System.out.println("결과값 : " + fc2.result);	// -1
		System.out.println("결과값 : " + fc3.result);	// 42
		System.out.println("총 연산횟수 : " + FourCalculator.count);	// 3
	}
}






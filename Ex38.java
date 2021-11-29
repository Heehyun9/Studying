package day9;

// 메서드 오버로딩:파.개.타.				(나중에) <-----> 메서드 오버라이딩
//			"파라미터의 개수가 다르거나 타입이 다르거나"
public class Ex38 {
	static int sum(int a, int b) {
		return a+b;
	}
	static int sum(int a, int b, int c) {
		return a+b+c;
	}
	static double sum(double a, double b, double c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(sum(2,3));
		System.out.println(sum(2,3,4));
		System.out.println(sum(1.1 , 2.2 , 3.3));
	}
}














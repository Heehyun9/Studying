package day7;

// 메서드 오버로딩 : "파라미터의 개수가 다르거나 타입이 다르거나" 
//               [주의] 리턴타입은 아니다.
public class Ex710 {
	static int plus(int x, int y) {
		return x+y;
	}
	static double plus(double x, double y) {
		return x+y;
	}
	public static void main(String[] args) {
		System.out.println("1+2:" + plus(1,2));
		System.out.println("1.2+2.1:" + plus(1.2,2.1));
	}

}





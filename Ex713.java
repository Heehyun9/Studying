package day7;

public class Ex713 {
	static int fact(int n) {	// n!을 리턴하는 메서드.
		if(n==1) return 1;
		return n * fact(n-1);
	}
	public static void main(String[] args) {
		System.out.println("4! = " + fact(4));
		System.out.println("5! = " + fact(5));
	}
}

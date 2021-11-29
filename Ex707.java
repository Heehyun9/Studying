package day7;

public class Ex707 {
	static int ret10() {
		return 10;
	}
	public static void main(String[] args) {
		int n = ret10() + 10;
		System.out.println(n * ret10());
	}

}

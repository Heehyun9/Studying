package day11;

class Static1 {
	static int num = 55;
	static void showNum() {
		System.out.println("num : " + num);
	}
}
public class Ex48 {
	public static void main(String[] args) {
		System.out.println(Static1.num);
		Static1.showNum();
	}
}

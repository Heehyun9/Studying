package day16;

// MyWrapper : 정수값을 하나 저장하기 위한 목적으로 만든 클래스.
class MyWrapper {
	private int num;
	MyWrapper(int num) { this.num = num; }
	@Override
	public String toString() {
		return num+"";   // 또는 String.valueOf(num);
	}
}
public class Ex1602 {
	static void show(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		show(new MyWrapper(10));
		show(new MyWrapper(20));
	}
}





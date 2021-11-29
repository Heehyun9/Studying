package day16;

public class Ex1603 {
	static void show(Object obj) {
		System.out.println(obj);
	}
	public static void main(String[] args) {
		// 객체생성(1) --> '경제성' 고려X.
		show(new Integer(10));
		show(new Integer(10));
		
		// 객체생성(2) --> '경제성' 고려O.
		Integer i1 = Integer.valueOf("100");
		Integer i2 = Integer.valueOf(100);
		
		// 이해 : "Auto-Unboxing" / "Auto-Boxing"
		Integer n = i1 + i2;  // auto-unboxing, auto-boxing !
		System.out.println("n : " + n);
		
	}
}









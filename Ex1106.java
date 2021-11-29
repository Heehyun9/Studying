package day11;

public class Ex1106 {
	public static void main(String[] args) {
		String s = "Hello";
		String s2 = "안녕하세요";
		System.out.println(s.length());	  // 5
		System.out.println(s2.length());	// 5
		
		System.out.println(s.equals("Hello"));   // true
		
		String s3 = "AAB";
		String s4 = "ACB";
		String s5 = "ACB";
		System.out.println(s3.compareTo(s4));   // "(-)부호"의 값.   
		System.out.println(s4.compareTo(s5));   // 0 ---> 두 문자열의 내용이 같음.
		
		// 숫자를 문자열로.
		String s6 = String.valueOf(55);
		String s7 = 55 + "";
		System.out.println(s6 + "," + s7);    // 55,55
	}
}










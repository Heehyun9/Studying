package day11;

public class Ex1105 {
	public static void main(String[] args) {
		String s1 = "웹";	// 문자열 객체 생성
		String s2 = "&";	// 문자열 객체 생성
		String s3 = "앱";	// 문자열 객체 생성
		String s4 = s1+s2;   // String s4=s1.concat(s2);	// 문자열 객체 생성
//		System.out.println(s1.concat(s2));
		String s5 = s4+s3;	 // String s5=s4.concat(s3);	// 문자열 객체 생성
		
		System.out.println(s5);
	}
}

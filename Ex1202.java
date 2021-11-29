package day12;

// 문자열의 복제 : "과연 또다른 문자열 객체를 만들 필요가 있을까? 어차피 Immutable인데."
public class Ex1202 {
	public static void main(String[] args) {
		String s1 = "Java";
//		String s2 = s1;   			  // 복제x
		String s2 = new String(s1);   // 복제o
		s1 = "자바";		// s1의 내용만 "자바"로, s2의 내용은 여전히 "Java"로.
		
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1==s2);   // true : 참조값이 같음.
		
		
	}
}

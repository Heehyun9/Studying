package day12;

import java.util.Arrays;

//Ex1201.	문자열 메서드:
//	.split()
//	.indexOf()
//	.substring()
//문자열 -> 정수:
//	Integer.parseInt("34") ----> 34

public class Ex1201 {
	public static void main(String[] args) {
		String str = "자바_C_파이썬_웹개발1";
//		String str2 = "자바 C 파이썬_웹개발1";
		String[] arr;

		System.out.println("마지막 인덱스번호에 위치한 문자 : " 
				+ str.charAt(str.length()-1));
		char ch = str.charAt(str.length()-1);       // '1'
		System.out.println("마지막 문자에 3을 더하면 : " + (ch - '0' + 3));

		System.out.println("마지막 문자에 3을 더하면 : " + 
							(Integer.parseInt(str.substring(str.length()-1))+3) );
		
		/*

		// substring(int)
//		String str3 = str.substring(9);   // 인덱스# 9부터 끝까지.
		String str3 = str.substring(9, str.length());
		System.out.println(str3);
		
		// substring(int,int★) : 언어들마다 조금씩 달라.
		String str4 = str.substring(0,2); // 인덱스# 0부터 시작해서 2가 되기 "전까지".
		System.out.println(str4);
		*/
		
		/*
		// indexOf(문자열) ----> 문자열이 위치한 index번호를 리턴.
		// (ex) indexOf("웹개발") ---> means, index# of "웹개발"
		System.out.println( str.indexOf("웹개발") );     // 9
		System.out.println( str.indexOf("C")); 	// 3
		System.out.println( str.indexOf("자바")); // 0
		System.out.println( str.indexOf("파이썬")); // 5
		System.out.println( str.indexOf("C++"));  // -1 (없으면)
		
		// contains(문자열) -- 참고.
		System.out.println( str.contains("C++")); // false
		*/		
		
		/*
		arr = str.split("_");
//		arr = str2.split("[ _]");   // (참고) 
				// (이해) split() 메서드 내부적으로 new키워드를 사용해서
				//       배열 객체를 만들어(생성해)준다.
		
		// '향상된for문' (for-each문)
		// [문법] for(변수선언 : 집단의개념) { ... }
		for(String s : arr) {
			System.out.println(s);
		}
		
//		System.out.println(Arrays.toString(arr));
		
//		for(int i=0; i<=arr.length-1; i++) {
//			System.out.println(arr[i]);
//		}
		 */
	}
}









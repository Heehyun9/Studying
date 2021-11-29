package day11;

public class Ex1104 {
	public static void main(String[] args) {
		String s1 = "웹";
		String s2 = "&";
		String s3 = "앱";
		System.out.println(s1 + s2 + s3);   // + : 문자열의 결합(Concatenation)
		
		String s4 = "웹";	// 경제성 고려O (이해)
		String s5 = new String("웹");   // 경제성 고려X (이해)
		
		// 문자열의 동등비교 : 문자열.equals(문자열)
		if(s1.equals(s4)) {
			System.out.println("s1과 s4의 내용이 같음.");
		}
		if(s1==s4) {
			System.out.println("s1과 s4의 참조값이 같음.");
		}
		
		// s4와 s5의 내용을 비교.
		if(s4.equals(s5)) {
			System.out.println("s4와 s5의 내용이 같음.");
		}
		// s4와 s5의 참조값을 비교.
		if(s4!=s5) {
			System.out.println("s4와 s5의 참조값이 다름.");
		}
	}
}
// 1. 문자열 리터럴을 만나면, 문자열 객체를 생성. (경제성 고려)
//								(이미 그 문자열 객체가 생성되어 있으면, 추가 생성하지 않는다.)
// 2. 문자열 객체는 그 내용을 변경할 수 없는 "Immutable" 객체다.
// 3. 문자열의 내용비교는 .equals() 메서드를 사용, 참조값 비교는 연산자 ==을 사용.
// 4. new 키워드를 사용해서 객체 생성시, 경제성 고려 없이, 무조건 객체 하나가 생성됨.














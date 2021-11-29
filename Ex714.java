package day7;

public class Ex714 {
	static boolean isPalindrome(String str) {
		if(str.length()<=1)
			return true;
		if(str.charAt(0) != str.charAt(str.length()-1))
			return false;
		return isPalindrome(str.substring(1, str.length()-1));
	}
	public static void main(String[] args) {
//		String s = "Hello";
//		System.out.println(s.substring(1, s.length()-1));
		
		System.out.println(isPalindrome("bad"));
		System.out.println(isPalindrome("racecar"));
		System.out.println(isPalindrome("noon"));
	}
}






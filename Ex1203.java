package day12;

// Ex1203 : StringBuilder / StringBuffer
public class Ex1203 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("ab").append(123);			// ab123
		sb.insert(2, true);
		
		System.out.println(sb);      // sb ---> sb.toString()
		
	}
}

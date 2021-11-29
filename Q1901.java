package day19;

import java.util.HashSet;

//(고급)연습1:	정수를 다섯개 입력받아서, HashSet에 담는다.
//Q1901.	(다만, 일의자리 숫자가 같으면 '같은' 객체로 본다.)
//	(실행결과) 정수 입력 : 51 71 62 64 55 (엔터)
//		   셋 : 51 62 64 55
class Int1 {
	private int num;
	Int1(int num) { this.num = num; }
	@Override
	public String toString() {
		return num + "";     // 또는 String.valueOf(num)  
	}					// 참고로, 문자열을 정수로: Integer.parseInt("51") --> 51
	@Override
	public int hashCode() {
		return 7;
	}
	@Override
	public boolean equals(Object obj) {
		// num%10 vs obj.num%10
		if(num%10 == ((Int1)obj).num%10) 
			return true;
		return false;
	}
}
public class Q1901 {
	public static void main(String[] args) {
		int[] arr = { 51, 71, 62, 64, 55 };
		HashSet<Int1> set1 = new HashSet<Int1>();
		for(int i=0; i<=arr.length-1; i++) {	// i : 0 ~ 4
			set1.add( new Int1(arr[i]) );
		}
		
		System.out.print("셋 : ");
		System.out.println(set1);
	}
}





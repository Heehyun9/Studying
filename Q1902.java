package day19;

import java.util.HashSet;

//(고급)연습2:	정수를 다섯개 입력받아서, HashSet에 담는다.
//Q1902.	(다만, 십의자리 숫자가 같으면 '같은' 객체로 본다.)
//	(실행결과) 정수 입력 : 51 71 62 64 55 (엔터)    // 두 자리 숫자 가정.
//		   셋 : 51 71 62		// 출력 순서 중요X.
//		- 클래스 Int2

class Int2 {
	private int num;
	Int2(int num) { this.num = num; }
	@Override
	public String toString() {
		return num + "";
	}
	@Override
	public int hashCode() {
		return 7;
	}
	@Override
	public boolean equals(Object obj) {
		// num vs obj.num
		if(num/10 == ((Int2)obj).num/10) 
			return true;
		return false;
	}
	
}
public class Q1902 {
	public static void main(String[] args) {
		int[] arr = { 51, 71, 62, 64, 55 };
		Int2[] arr2 = new Int2[arr.length];
		for(int i=0; i<=arr.length-1; i++) {
			arr2[i] = new Int2(arr[i]);
		}
			
		HashSet<Int2> set2 = new HashSet<Int2>();
		for(int i=0; i<=arr2.length-1; i++) {
			set2.add(arr2[i]);
		}
		
		System.out.print("셋 : ");
		System.out.println(set2);
	}
}



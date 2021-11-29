package day7;

import java.util.Arrays;

public class Ex702 {
	public static void main(String[] args) {
		int[] lotto2 = new int[6];		// 1 ~ 45 의 값을 6개 저장.
		
		for(int i=0; i<=5; i++) {
			int num = (int)(Math.random()*45) + 1;		// 1 ~ 45
			
			boolean check = false;    // 중복여부. true:중복이다 / false:중복이아니다
			for(int j=0; j<=i-1; j++) {		// 이해: i-1
				if(lotto2[j] == num) {
					check = true;
					break;
				}
			}
			if(check) {
				i--;
				continue;
			}
			
			System.out.print(num + " ");	  // (case) 12 3 44 34 38 44 
			
			lotto2[i] = num;
			
		}
		
		System.out.print("\n로또 번호 : ");
		Arrays.sort(lotto2);		// 사실은 권장: 버블정렬, 선택정렬, 삽입정렬.
		for(int i=0; i<=5; i++) {
			System.out.print(lotto2[i] + " ");
		}
		
	}
}









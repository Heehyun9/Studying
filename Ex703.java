package day7;

import java.util.Arrays;

public class Ex703 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		
		int rowNum = 0;
		int colNum = 1; 
		
		for(int i=1; i<=9; i++) {
			arr[rowNum][colNum] = i;

			// rowNum과 colNum을 변경 (좌표 이동)
			if(i%3==0) {   // 3의 배수라면 밑으로 이동.
				rowNum++;
				if(rowNum==3)
					rowNum = 0;
			} else {		// 아니라면, 오른쪽 위로 이동.
				rowNum--;
				if(rowNum<0)
					rowNum = 2;
				colNum++;
				if(colNum==3)
					colNum = 0;
			}
		}
		
		for(int i=0; i<=2; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}








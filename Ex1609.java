package day16;

import java.util.ArrayList;
import java.util.Scanner;

//Ex1609.	연습(ArrayList).
//사용자로부터 입력받은 정수를 저장할 ArrayList를 생성,
//-1을 입력할 때까지 반복해서 사용자가 입력한 값을 저장(끝에 추가).
//-1을 입력하면, 그동안 입력받았던 모든 값들을 출력.(그냥 단순히 sysout)
//
//(실행결과의 예) 정수 입력(-1:종료) : 3 (엔터)
//		정수 입력(-1:종료) : 4 (엔터)
//		정수 입력(-1:종료) : 5 (엔터)
//		정수 입력(-1:종료) : -1 (엔터)
//		ArrayList의 내용 : [3, 4, 5]
public class Ex1609 {
	static boolean myContains(int[] a, int n) {
		boolean result = false;    // 없다고 가정하고 시작.
		for(int num : a) {
			if(num == n) {
				result = true;
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		while(true) {
			System.out.print("정수 입력(-1:종료) : ");
			int input = sc.nextInt();
			if(input==-1) break;
			list1.add(input);
		}
		System.out.println("ArrayList의 내용 : " + list1);
		*/
		
//		(추가연습:고급)	int[] arr = { 2, 3, 4, 5 };
//		이 배열을 ArrayList로 만들어 출력.
		/*
		int[] arr = { 2,3,4,5 };
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int n : arr) {
			list2.add(n);
		}
		System.out.println("ArrayList의 내용 : " + list2);
		*/

//		(추가연습:고급)	int형 배열에 특정한 값이 있는지 여부를 판단하여 리턴하는 메서드.
//		myContains(int[] a, int n) --> n이 있으면 true를 리턴.
//									   n이 없으면 false를 리턴.		
		int[] arr = { 2,3,4,5 };
		System.out.println(myContains(arr,2));   // true
		System.out.println(myContains(arr,6));   // false
		
		
		sc.close();    // optional.
	}
}











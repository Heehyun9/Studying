package day12;

import java.util.Scanner;

//Q1203.	문자열 "SchoolOfYG"가 있을 때,
//문자열 하나를 입력받아서, 위 문자열이 포함하고 있는지를 출력.

public class Q1203 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = "SchoolOfYG";
		System.out.print("입력 : ");
		String input = sc.next();

		//System.out.println(str.contains(input) ? "있음" : "없음" );
		System.out.println(str.indexOf(input)>=0 ? "있음" : "없음");
		
		sc.close();    // Optional
	}
}








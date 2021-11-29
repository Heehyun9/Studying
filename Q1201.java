package day12;

import java.util.Scanner;

/*
정수값 x를 입력받아서, x번째(NOT '인덱스#')의 글자를 출력.
(실행결과) 입력 : 3 (엔터)
	   출력 : h
*/
public class Q1201 {
	public static void main(String[] args) {
		String str = "SchoolOfYG";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int x = sc.nextInt();
		
		System.out.println("출력 : " + str.charAt(x-1));
		
		sc.close();    // Optional.
	}
}




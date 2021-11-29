package day12;

import java.util.Scanner;

import java.util.Scanner;

//Q1202. 3개의 문자열을 입력받아(s1,s2,s3),
//ABC순으로 정렬 후 출력(s1,s2,s3 순서대로 출력).
//apple / kiwi / banana
//

public class Q1202 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력 : ");
		String s1 = sc.next();
		String s2 = sc.next();
		String s3 = sc.next();
		
		//1) s1과 s2를 비교.
		if(s1.compareTo(s2)>0) {
			String t = s1;
			s1 = s2;
			s2 = t;
		}
		
		//2) s2와 s3를 비교.
		if(s2.compareTo(s3)>0) {
			String t = s2;
			s2 = s3;
			s3 = t;
		}
		
		//3) s1과 s2를 비교.
		if(s1.compareTo(s2)>0) {
			String t = s1;
			s1 = s2;
			s2 = t;
		}

		System.out.println("ABC순으로 출력 : " + s1 + "," + s2 + "," + s3);
		
		sc.close();    // Optional.
	}
}






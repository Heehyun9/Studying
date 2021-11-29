package day7;

import java.util.Scanner;

// Ex712.연습. (실행결과) 3개의 정수를 입력 : 15 7 29 (엔터)
// 가장 큰 값 : 29
//
// --> 3개의 정수를 파라미터로 받아서, 이들 중 가장 큰 값을 리턴하는 메서드를
// 만들고, main()에서 이를 이용하여 가장 큰 값을 출력.

public class Ex712 {
	static int max(int n1, int n2, int n3) {
		if(n1>n2 && n1>n3) 
			return n1;
		if(n2>n1 && n2>n3)
			return n2;
		return n3;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("3개의 정수를 입력 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("가장 큰 값 : " + max(a,b,c));
	}
}






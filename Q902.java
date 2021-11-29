package day9;

import java.util.Scanner;

//Q902.	class Triangle 작성.
class Triangle {
	int w;	// 밑변
	int h;	// 높이
	
	Triangle(int w, int h) {
		this.w = w;
		this.h = h;
	}
	
	double area() {
		return 0.5 * w * h;
	}
}

public class Q902 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("밑변 : ");
		int w= sc.nextInt();
		System.out.print("높이 : ");
		int h = sc.nextInt();
		
		Triangle t = new Triangle(w, h);

		System.out.println("밑변이 "+t.w+", 높이가 "+t.h+"인 삼각형의 넓이는 "+t.area()+"이다.");
		
		sc.close();    // optional.
	}

}

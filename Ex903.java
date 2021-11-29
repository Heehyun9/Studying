package day9;

class Point {
	int x;
	int y;
	Point(int n1, int n2) {
		x = n1;
		y = n2;
	}
	double dist(int x2, int y2) {
		int dx = x - x2;    // x축 방향의 거리
		int dy = y - y2;	// y축 방향의 거리
		return Math.sqrt(dx*dx + dy*dy);   // 대각선의 길이를 리턴
	}
}
public class Ex903 {
	public static void main(String[] args) {
//		Point p1 = new Point();		// 객체를 생성.
//		Point p2 = new Point();		// 객체를 생성.
//		p1.x = 1;  p1.y = 1;		// 객체의 필드를 초기화.
//		p2.x = 4;  p2.y = 5;		// 객체의 필드를 초기화.

		Point p1 = new Point(1,1);
				// 1. p1이라는 참조변수를 선언.
				// 2. Point라는 설계도를 가져다가 객체를 생성.
				// 3. 생성자 호출 "Point(1,1)" --> 생성자가 실행됨.
		Point p2 = new Point(4,5);
		
		System.out.println("두 점 간의 거리 : " + p1.dist(p2.x, p2.y));
	}
}










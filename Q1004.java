package day10;

class Point {
	int x,y;
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	double distance(int x2, int y2) {   // (x,y) ~ (x2,y2) 간의 거리를 리턴.
		int dx = x - x2;
		int dy = y - y2;
		return Math.sqrt(dx*dx + dy*dy);
	}
	@Override
	public String toString() {		// (고급)
		return "("+x+","+y+")";		// 예를 들어, "(1,1)"
	}
} 
class Line2 {
	Point p1, p2;
	Line2(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	void showLine() {
		//System.out.println("Line2객체:("+p1.x+","+p1.y+") ~ ("+p2.x+","+p2.y+")");
		System.out.println("Line2객체:"+p1+" ~ "+p2);		// (고급)
	}
	double distance() {
		return p1.distance(p2.x, p2.y);			// (이해: 코드를 재활용했음.)
	}
}

public class Q1004 {
	public static void main(String[] args) {
		Point point1 = new Point(1,1);
		Point point2 = new Point(4,5);
		Line2 line2 = new Line2(point1, point2);
		line2.showLine();   // Line2객체:(1,1) ~ (4,5)
		System.out.println("길이 : " + line2.distance());    // 길이 : 5.0
	}
}






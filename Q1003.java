package day10;

class Line1 {
	int x1,y1,x2,y2;
	Line1(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	void showLine() {
		System.out.println("Line1객체:("+x1+","+y1+") ~ ("+x2+","+y2+")");
	}
	
	double distance() {
		int dx = x1 - x2;
		int dy = y1 - y2;
		double dist = Math.sqrt(dx*dx + dy*dy);
		return dist;
	}
}
public class Q1003 {
	public static void main(String[] args) {
		Line1 line1 = new Line1(1,1,5,4);
		line1.showLine();    // Line1객체:(1,1) ~ (5,4)
		System.out.println("길이 : " + line1.distance());  // 길이 : 5.0
	}
}





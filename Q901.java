package day9;

class Circle {
	int radius;
	void setRadius(int r) { radius = r; }
	double getArea() {
		return Math.PI * radius * radius;
	}
}
public class Q901 {
	public static void main(String[] args) {
		Circle circle;
		circle = new Circle();
		circle.setRadius(10);
		System.out.println("원의 넓이 : " + circle.getArea() );
						// 출력 : "원의 넓이 : 314..."

	}
}

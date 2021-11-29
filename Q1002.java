package day10;

class Car {
	int plate;     // 번호판
	String color;  // 차량 색상
	String model;  // 차량 모델명

	void setPlate(int plate) {
		this.plate = plate;
	}
	void setColor(String color) {
		this.color = color;
	}
	void setModel(String model) {
		this.model = model;
	}
	void showCar() {
		System.out.println("Car객체: "+model+"("+color+"), "+plate+"번 차량");
	}
}
public class Q1002 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.setPlate(1234);   c1.setColor("blue");   c1.setModel("모델A");
		c2.setPlate(5678);   c2.setColor("white");  c2.setModel("모델B");
		c3.setPlate(9012);   c3.setColor("red");    c3.setModel("모델C");
		
		c1.showCar();
		c2.showCar();
		c3.showCar();
	}
}








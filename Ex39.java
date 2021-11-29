package day9;

class Cellphone {
	String model;
	String color;
	int capacity;
	
	Cellphone(String model, String color, int capacity) {
		this.model = model;		// this : 객체 자기자신의 참조값 (이해)
		this.color = color;
		this.capacity = 256;
	}
}

public class Ex39 {
	public static void main(String[] args) {
//		Cellphone phone1 = new Cellphone();	// ERR. (이해: 왜?)
		Cellphone phone2 = new Cellphone("폴드2", "블랙", 256);

		System.out.println(phone2.model);
		System.out.println(phone2.color);
		System.out.println(phone2.capacity);
	}
}









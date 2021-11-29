package day12;

class Adder {
	int num;
	Adder() { num = 0; }
	Adder add(int n) { 
		num+=n;
		return this; 
	}
	void show() { System.out.println(num); }
}
public class Ex1204 {
	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add(1).add(3).add(5).show();    // 9
	}
}

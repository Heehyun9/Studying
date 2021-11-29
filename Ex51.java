package day11;

class Animal {
	void breath() { System.out.println("숨쉰다."); }
}
class Lion extends Animal {
	@Override
	public String toString() {
		return "사자";
	}
} 
class ZooKeeper {
	void feed(Lion lion) {
		System.out.println(lion + "에게 고기 주기");
	}
}
public class Ex51 {
	public static void main(String[] args) {
		Lion obj1 = new Lion();
		ZooKeeper obj2 = new ZooKeeper();
		obj2.feed(obj1);     // 이해.
	}
}







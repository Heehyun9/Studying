package day11b;

class Animal {
	void breath() { System.out.println("숨쉰다."); }
}
class Lion extends Animal {
	@Override
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal {
	@Override
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal {
	@Override
	public String toString() {
		return "원숭이";
	}
}
class ZooKeeper {
//	void feed(Lion lion) {
//		System.out.println(lion + "에게 먹이주기");
//	}
//	void feed(Rabbit rabbit) {
//		System.out.println(rabbit + "에게 먹이주기");
//	}
//	void feed(Monkey monkey) {
//		System.out.println(monkey + "에게 먹이주기");
//	}
	void feed(Animal animal) {
		System.out.println(animal + "에게 먹이주기");
	}
}
public class Ex52_53 {
	public static void main(String[] args) {
		ZooKeeper zk = new ZooKeeper();
		
		// 고급연습: 난수발생을 해서 10마리의 동물 객체를 생성.
		//         그리고 각각에 대해 zk.feed() 호출하세요.
		Animal[] arr = new Animal[10];
		for(int i=1; i<=10; i++) {
			int num = (int)(Math.random() * 3) + 1;	// 1,2,3 난수발생.
			switch(num) {
			case 1:
				arr[i-1] = new Lion();  
				break;
			case 2:
				arr[i-1] = new Rabbit();
				break;
			case 3:
				arr[i-1] = new Monkey();
				break;
			}
		}         // 배열 완성.
		
		for(int i=0; i<=arr.length-1; i++) {
			System.out.print((i+1) + ": ");
			zk.feed(arr[i]);
		}
		
		
//		Lion lion = new Lion();
//		Rabbit rabbit = new Rabbit();
//		Monkey monkey = new Monkey();
//		zk.feed(lion);
//		zk.feed(rabbit);
//		zk.feed(monkey);
	}
}






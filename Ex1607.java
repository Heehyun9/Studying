package day16;

class Box<T> {	// 제네릭 클래스 : type parameter를 클래스이름 뒤에 붙인다.
	private T obj;
	
	void register(T obj) {
		this.obj = obj;
	}
	
	T get() { 
		return obj; 
	}
}
public class Ex1607 {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<Integer>();
		Box<String> box2 = new Box<String>();
		
		box1.register(55);	// auto-boxing (이해)
		box2.register("제네릭 안녕");
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}








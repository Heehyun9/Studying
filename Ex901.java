package day9;

class AA {
	int num1 = 5;
	static int num2 = 10;
	
	void mi() { System.out.println("인스턴스 메서드 실행됨."); }
	
}
public class Ex901 {
	public static void main(String[] args) {
		System.out.println("AA.num2 : " + AA.num2);       // 10
		
		AA obj1 = new AA();
		AA obj2 = new AA();
		
		obj1.mi();
		obj2.mi();
		
		System.out.println(obj1.num1);
		System.out.println(obj2.num1);
		
		obj1.num2 = 100;
		System.out.println(obj2.num2);      // 10? 100? (이해)
	}
}








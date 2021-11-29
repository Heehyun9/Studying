package day9;

//Q903.	class Numbers 작성.
class Numbers {
	int num1, num2;
	
	Numbers(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	void show() {
		System.out.println("num1:"+num1+",num2:"+num2);
	}
}
public class Q903 {
	public static void main(String[] args) {
		Numbers numbers;
		numbers = new Numbers(5, 3);
		numbers.show();    // 출력 : "num1:5,num2:3"
	}
}

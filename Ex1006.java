package day10;

class AA2 {
	int n1,n2,n3;
	AA2(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
}
class BB2 extends AA2 {
	int n4,n5;
	BB2(int n1, int n2, int n3, int n4, int n5) {
		super(n1,n2,n3);      // 부모클래스에게 n1,n2,n3를 초기화하는 역할을 떠넘김.
							  // (코드를 재사용하겠다는 것)
		this.n4 = n4;
		this.n5 = n5;
	}
}
public class Ex1006 {
	public static void main(String[] args) {
		BB2 obj = new BB2(10,20,30,40,50);
		
	}
}










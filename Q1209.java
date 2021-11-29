package day12;

class SomeClass {
	int n;
	SomeClass f(int n) { 
		this.n = n;
		return this;
	}
	SomeClass g() {
		n *= 2;
		return this;
	}
	SomeClass h() {
		n *= -3;
		return this;
	}
	
	@Override
	public String toString() {
		return n+"";         // String.valueOf(n);
	}
}
public class Q1209 {
	public static void main(String[] args) {
		SomeClass obj = new SomeClass();
		System.out.println( obj.f(1).g().h() );	// -6
	}
}






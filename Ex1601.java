package day16;

class Common {
	private int n;
	Common() { n = 0; }
	int getN() { return n; }
	/*synchronized*/ void plus() { 
		synchronized("키1") {
			n++; 
		}
	}
	/*synchronized*/ void minus() {
		synchronized("키1") {
			n--;
		}
	}
}

class AddThread extends Thread {
	Common common;
	AddThread(Common common) { this.common = common; }
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			common.plus();
		}
	}
}
class MinusThread extends Thread {
	Common common;
	MinusThread(Common common) { this.common = common; }
	@Override
	public void run() {
		for(int i=1; i<=1000; i++) {
			common.minus();
		}
	}
}

public class Ex1601 {
	public static void main(String[] args) {
		Common obj = new Common();
		AddThread t1 = new AddThread(obj);
		MinusThread t2 = new MinusThread(obj);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch(InterruptedException e) { } 
		System.out.println("(Common객체의) n : " + obj.getN());
	}
}









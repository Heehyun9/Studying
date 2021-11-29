package day7;

public class Ex711 {
	// isPrimeNumber(num) : num이 소수(prime number)이면 true를 리턴.
	static boolean isPrimeNumber(int num) {
		int count = 0;
		for(int i=1; i<=num; i++) {   // i : 1 ~ num
			if(num%i==0) count++;
		}
		if(count==2) 
			return true;
		return false;
	}
	
	// showPrimeNumbers(a,b) : a부터 b까지의 정수 중 소수를 모두 출력.
	static void showPrimeNumbers(int start, int end) {
		for(int i=start; i<=end; i++) {
			if(isPrimeNumber(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static void main(String[] args) {
		showPrimeNumbers(1, 100);
	}

}

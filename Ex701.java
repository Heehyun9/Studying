package day7;

public class Ex701 {
	public static void main(String[] args) {
		boolean[] lotto = new boolean[45];
		
		//System.out.println(lotto[0]);  // boolean타입의 '기본값'은 false임을 확인.
		
		// 인덱스번호를 난수발생 0~44 여섯번.
		for(int i=1; i<=6; i++) {
			int idx = (int)(Math.random()*45);
			if(lotto[idx]==true) {
				i--;				// 이해.
				continue;
			}
			// System.out.print(idx + " ");
			lotto[idx] = true;
		}

		System.out.print("로또 번호 : ");
		for(int i=0; i<=44; i++) {
			if(lotto[i]==true) {
				System.out.print(i+1 + " ");
			}
		}
	}
}







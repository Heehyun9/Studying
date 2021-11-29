package day19;

import java.util.Iterator;
import java.util.TreeSet;

class AA implements Comparable<AA> {
	private int num;
	AA(int num) { this.num = num; }
	@Override
	public String toString() {
		return num + "";
	}
	@Override
	public int compareTo(AA o) {
		// ---> 왼쪽>오른쪽 : 양수를 리턴
		// ---> 왼쪽<오른쪽 : 음수를 리턴
		// ---> 왼쪽==오른쪽 : 0을 리턴
		// num vs o.num
		if(num > o.num)
			return -1; //return 1;
		if(num < o.num)
			return 1; //return -1;
		return 0;
	}
}
public class Ex1903 {
	public static void main(String[] args) {
		TreeSet<AA> set5 = new TreeSet<AA>();
		set5.add(new AA(3));
		set5.add(new AA(7));
		set5.add(new AA(2));
		set5.add(new AA(5));

		//System.out.println(set5);			
		
		// 추가연습 : main() 수정 없이, 내림차순으로 출력되도록 하려면?
		
		// 추가연습 : 위 내용의 수정 없이, Iterator 객체를 사용해서 오름차순으로 출력하려면?
		Iterator<AA> itr = set5.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
}







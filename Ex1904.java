package day19;

import java.util.Comparator;
import java.util.TreeSet;

class BB {
	private int num;
	BB(int num) { this.num = num; }
	@Override
	public String toString() {
		return num + "";
	}
	public int getNum() {
		return num;
	}	
}
class MyComparator implements Comparator<BB> {
	@Override
	public int compare(BB o1, BB o2) {
		// o1.num vs o2.num
		// 왼>오 : 1을 리턴
		// 왼<오 : -1을 리턴
		// 왼=오 : 0을 리턴
		if(o1.getNum() > o2.getNum())
			return 1;
		if(o1.getNum() < o2.getNum())
			return -1;
		return 0;
	}
}
public class Ex1904 {
	public static void main(String[] args) {
		TreeSet<BB> set6 = new TreeSet<BB>(new MyComparator());
		set6.add(new BB(3));
		set6.add(new BB(7));
		set6.add(new BB(2));
		set6.add(new BB(5));
		
		System.out.println(set6);
		
		// 추가연습 : main() 수정 없이, 내림차순으로 출력되도록 하려면?
		
		// 추가연습 : 위 내용의 수정 없이, Iterator 객체를 사용해서 오름차순으로 출력하려면?

	}
}









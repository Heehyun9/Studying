package day19;

import java.util.HashSet;
import java.util.Iterator;

// Ex1901 이해:
// 1. 세 가지 복습(모든 요소를 출력)
// 2. for-each문과 Iterator객체를 이용한 방식의 차이.
// 3. itr.remove()의 작동방식을 이해.
// 4. String클래스는 문자열의 '내용비교'를 하는 것으로, hashCode()와 equals()가 적절히 오버라이드 되어 있음.
public class Ex1901 {
	public static void main(String[] args) {
		HashSet<String> set3 = new HashSet<String>();
		set3.add(new String("사과"));
		set3.add("딸기");
		set3.add("바나나");
		set3.add(new String("사과"));
		
		// 1.
//		System.out.println(set3);
		
		// 2. for-each문
//		for(String s : set3) {
//			System.out.print(s + " ");
//		}
		
		// 3. Iterator객체
		Iterator<String> itr = set3.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			if(str.equals("바나나"))
				itr.remove();         // remove() 작동방식의 이해.
									// 방금 전에 itr.next()가 리턴한 요소를 삭제!
			System.out.print(str + " ");
		}
		System.out.println("\n바나나 삭제 후 : " + set3);
	}
}




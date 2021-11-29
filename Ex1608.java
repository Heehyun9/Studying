package day16;

import java.util.ArrayList;

public class Ex1608 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(20);	// 10 20 30 20
		list1.add(2, 25);  // 인덱스번호 2 자리에 25를 추가.
		
		//System.out.println(list1);   // 또는 list1.toString()
		
		for(int i=0; i<=list1.size()-1; i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();  // 줄바꿈
		
		System.out.println("25라는 값이 있는지 : " + list1.contains(25));
		
		int idx = list1.indexOf(25);
		System.out.println("25의 인덱스번호 : " + idx);
		
		list1.remove(idx);    // 인덱스번호가 idx인 요소를 삭제.
		System.out.println("25 삭제 후 : " + list1);  // [10, 20, 30, 20]
	}
}







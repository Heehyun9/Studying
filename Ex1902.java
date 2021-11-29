package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// Ex1902 : TreeSet에, [3, 7, 2, 5, 4, 8, 6]  --> 정렬상태를 유지하고 있음!
public class Ex1902 {
	public static void main(String[] args) {
		int[] arr = { 3, 7, 2, 5, 4, 8, 6, 3 };
		TreeSet<Integer> set4 = new TreeSet<Integer>();
		for(int i=0; i<=arr.length-1; i++) {
			set4.add(arr[i]);
		}
		
//		System.out.println(set4);
		
		//Iterator<Integer> itr = set4.iterator();
		Iterator<Integer> itr = set4.descendingIterator();   // "Tree"Set에만!
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
	}
}








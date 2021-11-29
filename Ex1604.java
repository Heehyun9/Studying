package day16;

// Ex1604 : 제네릭 메서드. <T> ---> "T" : "type parameter"
public class Ex1604 {
	static <T> void printArray(T[] arr) {
		for(T item : arr) {
			System.out.print(item + " ");
		}
		System.out.println();   // 줄바꿈.
	}
	public static void main(String[] args) {
		Integer[] arr1 = { 1,2,3 };
		Double[] arr2 = { 1.1, 2.2, 3.3, 4.4 };
		Character[] arr3 = { 'H', 'I', '!' };
		
		System.out.print("arr1 : ");
		printArray(arr1);
		
		System.out.print("arr2 : ");
		printArray(arr2);
		
		System.out.print("arr3 : ");
		printArray(arr3);
		
		// 추가연습: printArray() 제네릭 메서드 정의문 ---> 주석 처리.
		//         메서드 오버로딩으로 변경.
	}
}










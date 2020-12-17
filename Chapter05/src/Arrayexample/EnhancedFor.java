package Arrayexample;

public class EnhancedFor {

	public static void main(String[] args) {
		// 향상된 for문 예제
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		int i;
		
		//인덱싱
		System.out.println("numbers[0] = " +numbers[0]);
		System.out.println("numbers[3] = " +numbers[3]);
		
		//일반 for문 출력
		for(i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		for(int num : numbers ) {
			System.out.print(num + " ");
		}
	}
	

}

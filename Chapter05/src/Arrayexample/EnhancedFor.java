package Arrayexample;

public class EnhancedFor {

	public static void main(String[] args) {
		// ���� for�� ����
		int[] numbers = new int[] {1, 2, 3, 4, 5};
		int i;
		
		//�ε���
		System.out.println("numbers[0] = " +numbers[0]);
		System.out.println("numbers[3] = " +numbers[3]);
		
		//�Ϲ� for�� ���
		for(i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		for(int num : numbers ) {
			System.out.print(num + " ");
		}
	}
	

}

package method;

public class ArrayTest {
	
	//array�� �����ϴ� method
	public static int add(int[] score) {
		int total = 0, i;
		for(i=0; i<score.length; i++) {
			total += score[i];
		}
		return total;
	}
	
	public static void main(String[] args) {
		//int[] arr = new int[] {90, 80, 70};
		//int sum = add(arr)
		int sum = add(new int[] {90, 80, 70});
		//�Ű������� �迭�� �����ؼ� �Է�(����)
		
		
		System.out.println(sum);
	}

}

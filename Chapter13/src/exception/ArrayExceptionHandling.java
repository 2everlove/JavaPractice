package exception;

public class ArrayExceptionHandling {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		//저장 및 출력
		try {
			for(int i=0;i<=arr.length;i++) {
				arr[i]=i+1;
				System.out.println(arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		
	}

}

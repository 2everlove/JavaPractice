package exception;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[2];
			
			arr[0] = 10;
			arr[1] = 20;
			arr[2] = 30;
			
			System.out.println("10, 20, 30 저장");
//		} catch(ArrayIndexOutOfBoundsException e) {
		} catch(Exception e) {
			System.out.println(e);
			System.out.println("예외 처리 부분");
		}
		System.out.println("수행 완료");
	}

}

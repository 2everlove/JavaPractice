package arraycopy;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = {20, 10, 50, 40, 30};
		int[] arry2 = new int[5];
		int i;
		
		//clone()메서드로 복사
		int[] arry3 = arry1.clone();
		
		for(i=0; i<arry3.length; i++) {
			System.out.print(arry3[i] + " ");
		}
		System.out.println();
		//arraycopy() 메서드
		System.arraycopy(arry1, 0, arry2, 0, 5);
		for(i=0; i<arry2.length; i++) {
			System.out.print(arry2[i] + " ");
		}


	}
}

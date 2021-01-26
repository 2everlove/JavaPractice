package object.clone;

public class ArrayCopy {

	public static void main(String[] args) {
		//배열 복사
		int[] ar1 = {1,2,3,4};
		
		//clone()으로 복사 - 이미 재정의되어서 가능함
		int[] ar2 = ar1.clone();
		
		for(int i1 : ar1) {
			System.out.print(i1+", ");
		}
		System.out.println();
		for(int i2 : ar2) {
			System.out.print(i2+", ");
		}
	}

}

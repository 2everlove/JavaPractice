package algorithm;

public class SortTestBuble {

	public static void main(String[] args) {
		// 오름차순 정렬 - 버블 정렬 방식
		int[] array = {20,30,12,14,52,8,2,5,7};
		int temp;
		int i,j;
		for(i=0; i<array.length; i++) {
			for(j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for(int a : array) {
			System.out.print(a+" ");
		}
	}

}

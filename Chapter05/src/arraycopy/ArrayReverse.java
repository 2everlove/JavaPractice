package arraycopy;

public class ArrayReverse {

	public static void main(String[] args) {
		// 역순(거꾸로) 저장(복사)
		
		char[] arr1 = {'N', 'E', 'T'};
		/*char[] arr2 = new char[3];
		int i;
		int leng = arr1.length;
		
		for(i=0; i<leng; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println();
		
		//복사 저장
		for (i=0; i<leng; i++) {
			arr2[i] =arr1[i];
			
		}
		for (i=0; i<leng; i++) {
			System.out.print(arr2[i] + " ");
		}*/
		
/*		for (i=0; i<arr2.length; i--) {
			arr2[2-i] = arr1[i];
		}
		
		for (i=0; i<leng; i++) {
			System.out.print(arr2[i] + " ");
		}*/
		
		
		
		
		
		
		 
		char[] array = {'N', 'E', 'T', 'C', 'X', 'B', 'Z', 'D', 'A'};
		int i,j;
		int temp;
		for(i=1; i<array.length; i++) {
			temp = (int)array[i];
			j=0;
			for(j=i-1; j>=0; j--) {
				if ((int)array[j]>temp) {
					array[j+1] = array[j];
				} else {
					break;
				}
			}
			array[j+1] = (char) temp;
		}
		for(char a: array) {
			System.out.println((int)a + ", " + a);
		}
		
		
		
		
		
		
		
		
		
		
		
//		int[] array = {8, 3, 5, 6, 2};
//		int i,j;
//		int temp;
//		for(i=1; i<array.length; i++) {
//			temp = array[i];
//			j=0;
//			for(j=i-1; j>=0; j--) {
//				if (array[j]>temp) {
//					array[j+1] = array[j];
//				} else {
//					break;
//				}
//			}
//			array[j+1] = temp;
//		}
//		for(int a : array) {
//			System.out.print(a + " ");
//		}

	}

}

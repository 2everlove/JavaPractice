package arraycopy;

public class ArrayCopy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry1 = {20, 10, 50, 40, 30};
		int[] arry2 = new int[5];
		
		for(int i=0; i<arry1.length; i++) {
			arry2[i] = arry1[i];
			System.out.println(arry2[i]);
		}
		//일반 for문의 출력
		System.out.println("\narry2의 출력");
		for(int i=0; i<arry2.length; i++) {
			System.out.println(arry2[i]);
		}
		//
		//
		//
		//
        int size = arry2.length;
        for(int i=size-1; i>0; i--) {
            System.out.printf("\n버블 정렬 %d 단계 : ", size-i);
            for(int j=0; j<i; j++) {
                if(arry2[j] > arry2[j+1]) {
                    swap(arry2,j,j+1);
                }
                System.out.println();
                for(int v : arry2) {
                    System.out.printf("%3d ", v);
                }
            }            
        }
        System.out.println();


	}

	public static  void swap(int a[], int idx1, int idx2) {
        int temp = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = temp;		
	}

}

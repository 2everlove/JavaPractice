package twodemension;

public class TwoDemension1 {

	public static void main(String[] args) {
		// 2�� 3��
		int[][] arr = new int[2][3];
		
		System.out.printf("�迭�� ����(��) : %d��\n", arr.length);
		System.out.printf("�迭�� ����(��) : %d��\n", arr[0].length);
		
		//���
		int i,j;
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//����
		arr[0][0] = 1; 
		arr[0][1] = 2; 
		arr[0][2] = 3; 
		arr[1][0] = 4; 
		arr[1][1] = 5; 
		arr[1][2] = 6; 
		
		//���
		
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}

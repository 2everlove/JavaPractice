package Arrayexample;

public class ArrayTest3 {

	public static void main(String[] args) {
		// ������ �迭 ���� - ������ ���
		int[] arr = {90, 70, 80, 100}; //������ �迭 arr�� 4���� ���� ����
		int i,j, temp;
		int sum = 0;
		double avg = 0.0;
		
		//�迭�� �� ���ϱ�
		for(i=0; i<arr.length; i++) {
			sum = sum + arr[i]; //���� ���ϱ�
			System.out.println(sum);
		}
		avg = ((double)sum / arr.length);
		System.out.println("--------");
		System.out.println("�迭�� �հ� : " + sum);
		System.out.println("�迭�� ��� : " + avg);
		
		for(i=1; i<arr.length; i++) {
			temp = arr[i];
			j=0;
			for(j=i-1; j>=0; j--) {
				if(arr[j]>temp) {
					arr[j+1] = arr[j];
				} else {
					break;
				}
			}
			arr[j+1] = temp;
		}
		for(int a : arr) {
			System.out.printf("%d ", a);
		}
		
	}
	

}

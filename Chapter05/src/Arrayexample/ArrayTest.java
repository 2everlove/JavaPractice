package Arrayexample;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[3];
		int i;
				
		//nu.length�� �迭�� ����(����)
				System.out.printf("�迭�� ���� : %d��\n", num.length);
				
		//�迭�� ���� ����
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		for(i=0; i<num.length; i++)
			System.out.println(num[i]);
	}

}

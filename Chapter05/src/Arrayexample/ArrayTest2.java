package Arrayexample;

public class ArrayTest2 {

	public static void main(String[] args) {
		// ������ �迭�� ����
		int[] num = new int[] {10, 20, 30};
		int i;
				
		//nu.length�� �迭�� ����(����)
				System.out.printf("�迭�� ���� : %d��\n", num.length);
		
		//�ε��� - �����ؼ� ���� ���� ��
		System.out.println(num[1]);
		
		//�迭�� ����
		System.out.println(num[2] + 100);
		System.out.println(num[2]);
		System.out.println("-----------");
		//�ݺ������� ���
		for(i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println("-----------");
		//���� ����, ����
		num[2] = 230;
		System.out.println(num[2]);
		boolean compa;
		compa = (num[1] == 10);
		System.out.println(compa); // false
	}
	

}

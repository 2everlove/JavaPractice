package Arrayexample;

public class ArrayTest4 {

	public static void main(String[] args) {
		// �Ǽ��� �迭 ����&����
		double[] data = new double[5];
		int i;
		double total = 0.0, times = 0.0;
		
		//����
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//�迭�� ũ��
		System.out.printf("�迭�� ���� : %d��\n", data.length);
		
		//���
		
		for(i=0; i<data.length; i++) {
			System.out.println(data[i]);
			total += data[i];
			times *= data[i];
		}
		System.out.println("���� : " + total);
		System.out.println("�Ѱ� : " + times);
	}
	

}

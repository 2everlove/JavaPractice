package Arrayexample;

public class ArrayTest5 {

	public static void main(String[] args) {
		// �迭�� ��ȿ�� ���� �� ����ϱ�
		double[] data = new double[5];
		int i, size = 0;
		
		data[0] = 10.0;
		size++; //size=size+1 -> 1
		
		data[1] = 20.0;
		size++;
		
		data[2] = 30.0;
		size++;
		
		for(i=0; i<size; i++) {
			System.out.println(data[i]);
		}
	}
	

}

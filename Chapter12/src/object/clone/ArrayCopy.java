package object.clone;

public class ArrayCopy {

	public static void main(String[] args) {
		//�迭 ����
		int[] ar1 = {1,2,3,4};
		
		//clone()���� ���� - �̹� �����ǵǾ ������
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

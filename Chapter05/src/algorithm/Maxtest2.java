package algorithm;

public class Maxtest2 {

	public static void main(String[] args) {
		// �ִ밪�� ��ġ ��ȣ ã��
		int[] num = {3, 6, 9, 7, 4, 1};
		int maxIndex = 0; //0��° ��ġ ����
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>num[maxIndex]) {
				maxIndex = i;
			}
		}
		System.out.println("max index: num["+maxIndex+"]");
		System.out.println("max : "+num[maxIndex]);
	}

}

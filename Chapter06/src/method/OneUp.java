package method;

public class OneUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = oneUp(10, 5);
		System.out.println("��ȯ�� : " + num);

	}
	public static int oneUp(int x, int y) { //������ ��ȯ �޼���
		x = x + y;
		return x;
	}

}

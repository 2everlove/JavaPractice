package method;

public class AddTest {
	//��������(global) - �����Ǵ� ��
	// �� ���� ���ϴ� �޼���(�Ű������� 2����)
	public static int add(int n1, int n2) { //static�� �޼��� - new�� �ʿ����.
		//�������� - ������� �� - stack
		int result;
		result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		// add() �Լ� ȣ��
		int num1 = 10, num2 = -10;
		int sum = add(num1, num2);
		System.out.println("�հ� : " + (double)sum);
	}

}

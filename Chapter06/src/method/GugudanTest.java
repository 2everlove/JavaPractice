package method;

class Gugudan{
	//gugudan ��� �ż��� ����� (�ν��Ͻ��� �޼��� -> new �ʿ� | static�� �޼���)
	public void gugudan(int dan) { //int dan = scanner�� ���� ���(�Լ� �Է±�� -> �Ű�����)
		System.out.println("�������� ����մϴ�.");
		for(int i=1; i<10; i++) {
			System.out.println(dan + "X" + i + "=" + (dan*i));
		}
		//return;  --void�� ������ ��ȯ�� ���� ���⶧���� return �� �ʿ����.
	}
}

public class GugudanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gugudan gu = new Gugudan();

		gu.gugudan(7);		
	}

}

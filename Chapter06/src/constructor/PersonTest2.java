package constructor;

public class PersonTest2 {

	public static void main(String[] args) {
		// person �ڷ��� ����ϱ�
		Person son = new Person();
							//������
		
		//�ڷ� �Է�
		son.name = "�ȹλ�";
		son.height = 181F;
		son.weight = 64F;
		
		//�ڷ� ���
		son.showInfo();
		
		//�Ű������� �ִ� ������
		Person chu = new Person("��", 180.3F, 75.5F);
		chu.showInfo();

	}

}

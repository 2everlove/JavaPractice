package constructor;

public class PersonTest {

	public static void main(String[] args) {
		// person �ڷ��� ����ϱ�
		Person person = new Person("�ȹλ�");
							//������
		//person.name = "�ȹλ�";
		person.height = 181F;
		person.weight = 64F;
		
		person.showInfo();

	}

}

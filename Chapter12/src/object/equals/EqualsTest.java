package object.equals;

public class EqualsTest {

	public static void main(String[] args) {
		//String�� �ν��Ͻ� ��
		String name1 = new String("�Ｚ");
		String name2 = new String("�Ｚ");
		
		//�޸� �ּ� ���� ����
		System.out.println(name1==name2); //false
		
		//���ڿ� �� ���� ����
		System.out.println(name1.equals(name2)); //true
		
		//Book�� �ν��Ͻ� ��
		Book book1 = new Book(101, "�Ѱ�");
		Book book2 = new Book(101, "�Ѱ�");
		
		System.out.println(book1==book2);
		
		System.out.println(book1.equals(book2));
		
	}

}

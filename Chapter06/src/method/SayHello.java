package method;

public class SayHello {
	//sayHello() �޼ҵ� ����� - ��ȯ �ڷᰡ ����.(void)
	public static void sayHello() {
		System.out.println("Hello~ ");
	}
	
	//sayHello2() �޼ҵ� ����� -> �Ű� ����(�����ϴ� ����)�� �ִ� �޼���
	public static void sayHello2(String name) {
		System.out.println("Hello~ " + name);
	}

	public static void main(String[] args) {

		sayHello(); // sayHello() �޼��� ȣ��
		
		sayHello2("�ȹλ�"); // sayHello2() �޼��� ȣ��
		
		sayHello2("steve");

	}

}

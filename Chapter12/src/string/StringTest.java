package string;

public class StringTest {

	public static void main(String[] args) {
		
		String na1 = new String("���Ǽ�");
		String na2 = new String("���Ǽ�");
		
		System.out.println(na1==na2); //false - heap memory�� address�� �ٸ�
		System.out.println(na1.equals(na2)); //true - already overriding
		
		String na3 = "abcd";
		String na4 = "abcd";
		
		System.out.println(na3==na4); //true - memory�� ���Ǯ�� ��ġ�ؼ� address�� ���ٰ� ����
		System.out.println(na3.equals(na4)); //true
		
	}

}

package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		
		System.out.println("javaStr�� �ּҰ� : "+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("���� �� buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
		
		//���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun");
		
		System.out.println(buffer);
		System.out.println("���� �� buffer�� �޸� �ּ� : "+System.identityHashCode(buffer));
	}

}

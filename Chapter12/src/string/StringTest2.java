package string;

public class StringTest2 {

	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("adroid");
		
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ��� �ּҰ� : "+System.identityHashCode(javaStr));
		
		//���ڿ� ���� - concat()
		javaStr = javaStr.concat(androidStr);
		System.out.println(javaStr);
		System.out.println("����� ���ڿ��� �ּҰ� : "+System.identityHashCode(javaStr));
	}

}

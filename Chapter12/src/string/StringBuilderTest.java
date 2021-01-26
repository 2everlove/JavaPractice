package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		
		System.out.println("javaStr의 주소값 : "+System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산 전 buffer의 메모리 주소 : "+System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun");
		
		System.out.println(buffer);
		System.out.println("연산 후 buffer의 메모리 주소 : "+System.identityHashCode(buffer));
	}

}

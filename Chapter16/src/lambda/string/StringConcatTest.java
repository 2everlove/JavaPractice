package lambda.string;

public class StringConcatTest {

	public static void main(String[] args) {
		//일반 객체지향 구현 방식
//		String s1 = "Hill", s2 = "State";
		String s1 = "Hill";
		String s2 = "State";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
	}

}

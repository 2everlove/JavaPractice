package lambda.string;

public class StringConcatTest {

	public static void main(String[] args) {
		//�Ϲ� ��ü���� ���� ���
//		String s1 = "Hill", s2 = "State";
		String s1 = "Hill";
		String s2 = "State";
		
		StringConcatImpl concat = new StringConcatImpl();
		concat.makeString(s1, s2);
	}

}

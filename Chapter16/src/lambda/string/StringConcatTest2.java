package lambda.string;

public class StringConcatTest2 {

	public static void main(String[] args) {
		//���ٽ����� ����
		String s1 = "Hill";
		String s2 = "State";
		
		StringConcat concat;
		concat = (s,v) -> System.out.println(s+", "+v);
		concat.makeString(s1, s2);
		
	}

}

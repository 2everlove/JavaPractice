package variablescope;



public class StaticVariable {
	
	static int x;
	
	//����(static)�� ����
		
	public static int func2() {
		x += 2;
		return x;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(func2());
		System.out.println(x);
		System.out.println(10==x);
		
		System.out.println(LocalVariable.func1());
		System.out.println(LocalVariable.func1());
		
		//x�� ���� - ȣ��� �Ŀ��� �Ҹ����� �ʰ� ���� �����ϸ�
		//���α׷��� ����Ǿ�� �Ҹ��Ѵ�.
	}

}

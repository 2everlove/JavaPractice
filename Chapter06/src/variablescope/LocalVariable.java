package variablescope;



public class LocalVariable {
	
	static int y;
	
	//���������� ����
	public  static int func1() {
		int x = 1; // �������� x ����
		x += 1;
		return x;
	}
	
	public static int func3() {
		y += 2;
		return y;
	}
	
	public static void main(String[] args) {
		
		System.out.println(func1());
		System.out.println(func1());
		//x�� �������� - ȣ��� �� ��ȯ���� �ְ� �޸𸮿��� ����(�Ҹ�)
		
		//func1()�� x ���� ȣ��
		//System.out.println(x); �Ҹ��ؼ� ȣ�� �Ұ�
		
		System.out.println();
		
		
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(func3());
		System.out.println(y);
		System.out.println(10==y);
		
		System.out.println(StaticVariable.func2());
		System.out.println(StaticVariable.func2());

	}

}

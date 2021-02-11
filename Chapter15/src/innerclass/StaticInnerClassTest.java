package innerclass;


class OutClass {
	int num =10;
	static int sNum = 20;
	
	static class InClass{ //���� ���� Ŭ����
		int inNum=100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println(num+"(�ܺ� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println(sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println(inNum+"(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println(sInNum+"(���� Ŭ������ ���� ���� ���)");
		}
		static void sTest() {
//			System.out.println(num+"(�ܺ� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println(sNum+"(�ܺ� Ŭ������ ���� ���� ���)");
//			System.out.println(inNum+"(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println(sInNum+"(���� Ŭ������ ���� ���� ���)");
		}
	}
}


public class StaticInnerClassTest {

	public static void main(String[] args) {
		OutClass.InClass in = new OutClass.InClass();
		System.out.println("***���� ���� Ŭ������ �Ϲ� �޼��� ȣ��***");
		in.inTest();
		System.out.println("***���� ���� Ŭ������ ���� �޼��� ȣ��***");
//		in.sTest();
		OutClass.InClass.sTest(); //�ܺ�Ŭ����.����Ŭ������ ���� ����
	}

}

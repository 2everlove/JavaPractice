package virtualfuction;

public class TestA {
	int num;
	
	public void aaa() {
		System.out.println("aaa() ���");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA a1 = new TestA(); //���� �޸� ������ ��ġ
		a1.num = 10; //���޸� ���� ��ġ
		a1.aaa();//������ ���� �޸� ���� ��ġ (static������ ���⿡ ��ġ�Ѵ�.)
		System.out.println(a1);
		
		TestA a2 = new TestA();
		a2.num = 20;
		a2.aaa();
		System.out.println(a2);
	}
	

}

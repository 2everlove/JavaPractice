package innerclass;

public class Outer2 {
	int outNum = 100;
	static int sNum = 200;
	
	//Ŭ���� �̸��� ���� ��ü
	Runnable runner = new Runnable(){
		int localNum = 20;	//�͸� Ŭ����
		
		@Override
		public void run() {
			localNum=30;
			System.out.println(outNum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println(sNum+"(�ܺ� Ŭ������ ���� ����)");
			System.out.println(localNum+"(���� Ŭ������ �ν��Ͻ� ����)");
		}
		
	}; //�����ݷ� �ٿ�����
}

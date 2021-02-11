package innerclass;

public class Outer {
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(){ //��ȯ���� Runnable
		int num = 10;//�������̽� ���(final�� ����)
		
		class MyRunnable implements Runnable{ //Runnable�� ���� Ŭ����
			int localNum = 20;
			
			@Override
			public void run() {
//				num=20; final�̹Ƿ� ���� �Ұ� 
				System.out.println(outNum+"(�ܺ� Ŭ������ �ν��Ͻ� ����)");
				System.out.println(sNum+"(�ܺ� Ŭ������ ���� ����)");
				System.out.println(localNum+"(���� Ŭ������ �ν��Ͻ� ����)");
			}
			
		}
		return new MyRunnable();
		
	}
}

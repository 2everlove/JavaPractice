package thread;

public class BeepPrintTset2 {

	public static void main(String[] args) {
		//���ν������ �۾������带 �̿��� ���
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //Thread ��ü ����(�Ű�����-�۾�������(beepTask))
		
		thread.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); //1000ms -> 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}

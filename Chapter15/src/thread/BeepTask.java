package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	//�������� ����ϴ� �۾�(������) �����
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); // �Ҹ��� ����ϴ� �޼���
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}

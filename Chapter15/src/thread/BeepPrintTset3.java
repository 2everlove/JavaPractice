package thread;

import java.awt.Toolkit;

public class BeepPrintTset3 {

	public static void main(String[] args) {
		//���ν������ �۾������带 �̿��� ���
		//�͸� ��ü ����
		
		Thread thread = new Thread(new Runnable() {
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
		});
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

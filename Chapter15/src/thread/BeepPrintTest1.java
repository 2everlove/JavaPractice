package thread;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		//single thread�� �̿��ϴ� case
		//"��" ���ڸ� 5�� ��� -> 1�� ����
		for(int i=0; i<5;i++) {
			System.out.println("��");
			try {
				Thread.sleep(1000); //1000ms -> 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		//"��" �Ҹ��� �缺
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

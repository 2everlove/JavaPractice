package thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable{
	//비프음을 재생하는 작업(스레드) 만들기
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<5;i++) {
			toolkit.beep(); // 소리를 재생하는 메서드
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}

}

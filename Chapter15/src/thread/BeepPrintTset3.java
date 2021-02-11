package thread;

import java.awt.Toolkit;

public class BeepPrintTset3 {

	public static void main(String[] args) {
		//메인스레드와 작업스레드를 이용한 경우
		//익명 객체 구현
		
		Thread thread = new Thread(new Runnable() {
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
		});
		thread.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); //1000ms -> 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}

}

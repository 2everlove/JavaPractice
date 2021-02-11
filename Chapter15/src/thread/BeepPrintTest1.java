package thread;

import java.awt.Toolkit;

public class BeepPrintTest1 {

	public static void main(String[] args) {
		//single thread만 이용하는 case
		//"띵" 문자를 5번 출력 -> 1초 간격
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(1000); //1000ms -> 1s
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
		
		//"띵" 소리를 재성
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

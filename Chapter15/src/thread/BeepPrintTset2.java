package thread;

public class BeepPrintTset2 {

	public static void main(String[] args) {
		//메인스레드와 작업스레드를 이용한 경우
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask); //Thread 객체 생성(매개변수-작업스레드(beepTask))
		
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

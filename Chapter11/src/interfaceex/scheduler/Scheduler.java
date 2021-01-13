package interfaceex.scheduler;

public interface Scheduler { //타입변환
	
	//abstract method
	public void getNextCall(); //다음 전화를 가져옴
	public void sendCallToAgent(); //전화를 상담원에게 배분
}

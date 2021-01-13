package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		//전화 상담 배분
		System.out.println("전화 상담 배분 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 배분\nL:쉬고있거나 대기시간이 가장 적은 상담원에게 배분\nP:업무 skill이 높은 상담원에게 배분");
		
		int ch = System.in.read(); //read가 int로 받아서 int ch를 생성, 한 문자를 입력받을 때 사용 구문
		
		Scheduler scheduler = null; //interface형으로 객체 변수 선언
		
		if(ch=='r' || ch =='R') {
			scheduler = new RoundRobin();
		} else if (ch=='l' || ch =='L') {
			scheduler = new LeastJob();
		} else if (ch=='p' || ch =='P') {
			scheduler = new PriotyAllocation();
		} else if (ch=='a' || ch =='A') {
			scheduler = new AgentGetCall();
		} else {
			System.out.println("잘못입력하셨습니다.");
			return; // void 형일때 사용, 즉시 종료
		}
			
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

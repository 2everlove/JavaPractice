package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		//��ȭ ��� ���
		System.out.println("��ȭ ��� ��� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� ���\nL:�����ְų� ���ð��� ���� ���� �������� ���\nP:���� skill�� ���� �������� ���");
		
		int ch = System.in.read(); //read�� int�� �޾Ƽ� int ch�� ����, �� ���ڸ� �Է¹��� �� ��� ����
		
		Scheduler scheduler = null; //interface������ ��ü ���� ����
		
		if(ch=='r' || ch =='R') {
			scheduler = new RoundRobin();
		} else if (ch=='l' || ch =='L') {
			scheduler = new LeastJob();
		} else if (ch=='p' || ch =='P') {
			scheduler = new PriotyAllocation();
		} else if (ch=='a' || ch =='A') {
			scheduler = new AgentGetCall();
		} else {
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
			return; // void ���϶� ���, ��� ����
		}
			
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}

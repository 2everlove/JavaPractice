package collection.list;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	private String command; //수행하기
	private String to; //대상
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
	
	public String getCommand() {
		return command;
	}
	public String getTo() {
		return to;
	}

	@Override
	public String toString() {
		return to+"님에게 "+command+"을 보냅니다.";
	}
	
}



public class MessageQueueTest {

	public static void main(String[] args) {
//		Queue<Message> messageQueue = new Queue<>();//Queue가 추상이라 new로 선언 불가
		Queue<Message> messageQueue = new LinkedList<>();
		//Queue 인터페이스를 구현한 대표적인 클래스가 LikedList이다.
		
		//객체 생성
		Message mail = new Message("sendMail", "안민상");
		Message sms = new Message("sendSMS", "박하늘");
		Message katalk = new Message("sendKatalk", "이하이");
		
		//객체 넣기
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(katalk);
		
		//총 객체 수
		int number = messageQueue.size();
		System.out.println("총 객체 수 : "+number);
		
//		//객체 뺴기(꺼내기) -> 삭제
//		while(!messageQueue.isEmpty()) { //논리부정 - 비어있지 않으면 계속 실행
//			Message message = messageQueue.poll(); //poll이 message를 반환하고 Message 변수에 넣음
//			//조건을 통해 객체 꺼내기
//			switch(message.getCommand()) {
//			case "sendMail":
//				System.out.println(message.getTo()+"님에게 메일을 보냅니다.");
//				break;
//			case "sendSMS":
//				System.out.println(message.getTo()+"님에게 SMS를 보냅니다");
//				break;
//			case "sendKatalk":
//				System.out.println(message.getTo()+"님에게 katalk을 보냅니다.");
//				break;
//			}
//		}
		
		Message message = messageQueue.poll();
		System.out.println(message);
		System.out.println(message);
		System.out.println(message);
	}

}

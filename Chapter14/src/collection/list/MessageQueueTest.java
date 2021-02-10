package collection.list;

import java.util.LinkedList;
import java.util.Queue;

class Message{
	private String command; //�����ϱ�
	private String to; //���
	
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
		return to+"�Կ��� "+command+"�� �����ϴ�.";
	}
	
}



public class MessageQueueTest {

	public static void main(String[] args) {
//		Queue<Message> messageQueue = new Queue<>();//Queue�� �߻��̶� new�� ���� �Ұ�
		Queue<Message> messageQueue = new LinkedList<>();
		//Queue �������̽��� ������ ��ǥ���� Ŭ������ LikedList�̴�.
		
		//��ü ����
		Message mail = new Message("sendMail", "�ȹλ�");
		Message sms = new Message("sendSMS", "���ϴ�");
		Message katalk = new Message("sendKatalk", "������");
		
		//��ü �ֱ�
		messageQueue.offer(mail);
		messageQueue.offer(sms);
		messageQueue.offer(katalk);
		
		//�� ��ü ��
		int number = messageQueue.size();
		System.out.println("�� ��ü �� : "+number);
		
//		//��ü ����(������) -> ����
//		while(!messageQueue.isEmpty()) { //������ - ������� ������ ��� ����
//			Message message = messageQueue.poll(); //poll�� message�� ��ȯ�ϰ� Message ������ ����
//			//������ ���� ��ü ������
//			switch(message.getCommand()) {
//			case "sendMail":
//				System.out.println(message.getTo()+"�Կ��� ������ �����ϴ�.");
//				break;
//			case "sendSMS":
//				System.out.println(message.getTo()+"�Կ��� SMS�� �����ϴ�");
//				break;
//			case "sendKatalk":
//				System.out.println(message.getTo()+"�Կ��� katalk�� �����ϴ�.");
//				break;
//			}
//		}
		
		Message message = messageQueue.poll();
		System.out.println(message);
		System.out.println(message);
		System.out.println(message);
	}

}

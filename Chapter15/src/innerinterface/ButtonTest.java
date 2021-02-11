package innerinterface;

import innerinterface.Button.OnClickListener;

public class ButtonTest {

	public static void main(String[] args) {
		Button button = new Button();
		//CallListener Ŭ������ ��ü ���� - �Ű����� ����
		button.setListener(new CallListener());
		button.touch();
		
		button.setListener(new MessageListener());
		button.touch();
		
		button.setListener(new Button.OnClickListener() {

			@Override
			public void onClick() {
				System.out.println("������ ����ϴ�.");
			}
			
		});
		button.touch();
		
		//�͸� ��ü - �˻� ���
		button.setListener(new OnClickListener() { //import�� Button Ŭ���� �θ�
			
			@Override
			public void onClick() {
				System.out.println("�˻��� �մϴ�.");
			}
		});
		button.touch();
		
	}

}

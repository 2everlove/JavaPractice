package innerinterface;

public class CallListener implements Button.OnClickListener{
	//Button Ŭ������ OnClickListener �������̽��� ������ Ŭ����
	@Override
	public void onClick() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}
	
}

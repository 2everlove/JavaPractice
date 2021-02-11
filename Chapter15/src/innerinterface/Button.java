package innerinterface;

public class Button {
	private OnClickListener listener; //interface���� ��� ���� ����
	
	
	interface OnClickListener{
		public void onClick();
	}
	
	public void setListener(OnClickListener listener) {
		//�Ű������� ��ü�� ���� - ������ ����
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
}

package bookshelf;

public interface Queue {
	
	public void enQueue(String title); //å �߰�
	
	public String deQueue(); // å ������(����) - ��ȯ���� �ʿ� -> return
	
	public int getSize(); //����� ����
}

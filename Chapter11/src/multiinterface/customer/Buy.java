package multiinterface.customer;

public interface Buy {
	
	public void buy(); // �߻� �޼���
	
	default void order() { //default ���� �޼���
		System.out.println("���� �ֹ� �ϱ�");
	}
}

package genetic.box;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("���� �� ���� ��������.");
		String message = (String) box.getObject();
		System.out.println(message);
		
		//Apple class�� ����
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
	}

}

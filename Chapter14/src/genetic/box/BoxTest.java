package genetic.box;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObject("새해 복 많이 받으세요.");
		String message = (String) box.getObject();
		System.out.println(message);
		
		//Apple class형 생성
		box.setObject(new Apple());
		Apple apple = (Apple) box.getObject();
	}

}

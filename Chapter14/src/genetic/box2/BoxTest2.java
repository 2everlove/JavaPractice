package genetic.box2;

import genetic.box.Apple;

public class BoxTest2 {

	public static void main(String[] args) {
		//����ƽ �ڵ�
		Box<String> box = new Box<>();
		box.setBox("����");
		String message = box.getBox();
		System.out.println(message);
		
		//Integer�� �ڷ�
		Box<Integer> box2 = new Box<>();
		box2.setBox(123);
		int message2 = box2.getBox();
		System.out.println(message2);
		
		
		//Apple Ŭ���� ����
		Box<Apple> box3 = new Box<>();
		box3.setBox(new Apple());
		Apple apple = box3.getBox();
		System.out.println(apple);
	}

}

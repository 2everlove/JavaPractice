package genetic.box2;

import genetic.box.Apple;

public class BoxTest2 {

	public static void main(String[] args) {
		//제네틱 코드
		Box<String> box = new Box<>();
		box.setBox("하하");
		String message = box.getBox();
		System.out.println(message);
		
		//Integer형 자료
		Box<Integer> box2 = new Box<>();
		box2.setBox(123);
		int message2 = box2.getBox();
		System.out.println(message2);
		
		
		//Apple 클래스 참조
		Box<Apple> box3 = new Box<>();
		box3.setBox(new Apple());
		Apple apple = box3.getBox();
		System.out.println(apple);
	}

}

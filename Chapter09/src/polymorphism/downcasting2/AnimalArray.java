package polymorphism.downcasting2;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal{
	
	@Override //��� �� method ������
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void read() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ ��� �ָ� ���ư��ϴ�.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ��ɰ��� ����մϴ�.");
	}
}



public class AnimalArray {
	
	Animal[] aniArray = new Animal[3]; //��ü�� ������ �迭���� 3�� ����
	
	//��ü ����
	public void addAnimal() {
		aniArray[0] = new Human();
		aniArray[1] = new Eagle();
		aniArray[2] = new Tiger();
	}
	
	//�ٿ� ĳ���� �޼���
	public void testCasting() {
		for(int i=0; i<aniArray.length; i++) {
			if(aniArray[i] instanceof Human) {
				Human human = (Human) aniArray[i];
				human.read();
			} else if(aniArray[i] instanceof Eagle) {
				Eagle eagle = (Eagle) aniArray[i];
				eagle.flying();;
			} else if(aniArray[i] instanceof Tiger) {
				Tiger tiger = (Tiger) aniArray[i];
				tiger.hunting();
			}
			aniArray[i].move();
		}
	}
	

	public static void main(String[] args) {
		AnimalArray aArray = new AnimalArray();
		aArray.addAnimal(); //��ü ���� �޼��� ȣ��
		
		aArray.testCasting();


	}

}

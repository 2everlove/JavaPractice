package polymorphism.downcasting;

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



public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();
	
	//��ü ����
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Eagle());
		aniList.add(new Tiger());
	}
	
	//�ٿ� ĳ���� �޼���
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i); //anima �ν��Ͻ� ���� as ������
			if(ani instanceof Human) {
				Human hu = (Human)ani;
				hu.read();
			}
			if(ani instanceof Eagle) {
				Eagle ea = (Eagle)ani;
				ea.flying();
			}
			if(ani instanceof Tiger) {
				Tiger ti = (Tiger)ani;
				ti.hunting();
			}
			ani.move();
		}
	}
	
	
//	//�������� ������ �޼���(�Է� �Ű����� �θ�class ����)
//	public void moveAnimal(Animal animal) { //AnimalŬ������ �ڷ������� ����
//		animal.move();
//	}

	public static void main(String[] args) {
//		AnimalTest aTest = new AnimalTest();
		
		AnimalTest aTest = new AnimalTest(); // Ŭ������ ����ؼ� Ŭ���� �Ʒ��� �ִ� �޼ҵ� ���
		aTest.addAnimal();
		aTest.testCasting();
		
		Animal animal1 = new Human();
		Animal animal2 = new Eagle();
		Animal animal3 = new Tiger();
		
		
//		if(animal1 instanceof Human) { //anmal1�� Human�� �ν��Ͻ����
//			Human human = (Human) animal1; //Object�� -> Human class�� ����ȯ(downcast)
//			human.move();
//			human.read();
//			System.out.println();
//		}
//		
//		if(animal2 instanceof Eagle) {
//			Eagle eagle = (Eagle) animal2;
//			eagle.move();
//			eagle.flying();
//			System.out.println();
//		}
//		
//		if(animal3 instanceof Tiger) {
//			Tiger tiger = (Tiger)animal3;
//			tiger.move();
//			tiger.hunting();
//			System.out.println();
//		}
		
//		aTest.moveAnimal(animal1);
//		animal1.move();
		
		

	}

}

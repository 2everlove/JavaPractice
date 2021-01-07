package polymorphism;

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
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ư��ϴ�.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}



public class AnimalTest {
	
	//�������� ������ �޼���(�Է� �Ű����� �θ�class ����)
	public void moveAnimal(Animal animal) { //AnimalŬ������ �ڷ������� ����
		animal.move();
	}

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		Animal hum = new Human();

		
		Animal animal = new Animal();

		Animal tiger = new Tiger();
		Animal eagle = new Eagle();

		
		aTest.moveAnimal(hum);
		aTest.moveAnimal(animal);
		aTest.moveAnimal(eagle);
		aTest.moveAnimal(tiger);
	}

}

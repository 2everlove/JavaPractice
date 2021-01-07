package polymorphism;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	
	@Override //상속 때 method 재정의
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}



public class AnimalTest {
	
	//다형성을 구현한 메서드(입력 매개변수 부모class 생성)
	public void moveAnimal(Animal animal) { //Animal클래스를 자료형으로 넣음
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

package polymorphism.downcasting;

import java.util.ArrayList;

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
	
	public void read() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Eagle extends Animal {
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 펴고 멀리 날아갑니다.");
	}
}

class Tiger extends Animal {
	
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥감을 사냥합니다.");
	}
}



public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();
	
	//객체 생성
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Eagle());
		aniList.add(new Tiger());
	}
	
	//다운 캐스팅 메서드
	public void testCasting() {
		for(int i=0; i<aniList.size(); i++) {
			Animal ani = aniList.get(i); //anima 인스턴스 생성 as 다형성
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
	
	
//	//다형성을 구현한 메서드(입력 매개변수 부모class 생성)
//	public void moveAnimal(Animal animal) { //Animal클래스를 자료형으로 넣음
//		animal.move();
//	}

	public static void main(String[] args) {
//		AnimalTest aTest = new AnimalTest();
		
		AnimalTest aTest = new AnimalTest(); // 클래스를 사용해서 클래스 아래에 있는 메소드 사용
		aTest.addAnimal();
		aTest.testCasting();
		
		Animal animal1 = new Human();
		Animal animal2 = new Eagle();
		Animal animal3 = new Tiger();
		
		
//		if(animal1 instanceof Human) { //anmal1이 Human의 인스턴스라면
//			Human human = (Human) animal1; //Object형 -> Human class로 형변환(downcast)
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

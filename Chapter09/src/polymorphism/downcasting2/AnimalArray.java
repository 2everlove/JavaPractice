package polymorphism.downcasting2;

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



public class AnimalArray {
	
	Animal[] aniArray = new Animal[3]; //객체를 저장할 배열공간 3개 생성
	
	//객체 생성
	public void addAnimal() {
		aniArray[0] = new Human();
		aniArray[1] = new Eagle();
		aniArray[2] = new Tiger();
	}
	
	//다운 캐스팅 메서드
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
		aArray.addAnimal(); //객체 생성 메서드 호출
		
		aArray.testCasting();


	}

}

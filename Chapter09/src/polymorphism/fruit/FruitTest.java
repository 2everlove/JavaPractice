package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.사과 |2.바나나 |3.토마토 |4.종료");
		System.out.print("선택> ");
		int selNum = sc.nextInt();
		Fruit fruit; //부모클래스 선언
		if(selNum==1) {
			fruit = new Apple();
			fruit.showInfo();
		} else if(selNum==2) {
			fruit = new Banna();
			fruit.showInfo();
		} else if(selNum==3) {
			fruit = new Tomatto();
			fruit.showInfo();
		} else {
			System.out.println("잘못눌렀습니다.");
		}
		sc.close();

	}

}

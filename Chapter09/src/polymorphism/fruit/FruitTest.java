package polymorphism.fruit;

import java.util.Scanner;

public class FruitTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.��� |2.�ٳ��� |3.�丶�� |4.����");
		System.out.print("����> ");
		int selNum = sc.nextInt();
		Fruit fruit; //�θ�Ŭ���� ����
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
			System.out.println("�߸��������ϴ�.");
		}
		sc.close();

	}

}

package arraylist;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// ArrayList�� �����Ͽ� String class�� ��� ����
		ArrayList<String> fruitList = new ArrayList<>();
		
		//String class�� elements ���� - add()
		fruitList.add("���");
		fruitList.add("�ٳ���");
		fruitList.add("���ξ���");
		fruitList.add("����");
		
		//���� - size()
		System.out.printf("����Ʈ�� ���� : %d��\n", fruitList.size());
		
		System.out.println("\n=whole print=");
		//element position print - get()
		for(int i=0; i<fruitList.size(); i++) {
			String fruit = fruitList.get(i);
			System.out.println("���� �̸� : "+fruit);
		}
		System.out.println("\n=enhanced for=");
		for(String fruit1 : fruitList)
			System.out.println(fruit1);
		
		//element remove 
		System.out.println("\n=remove=");
		fruitList.remove(0);
		System.out.println(fruitList.get(0));
		System.out.println(fruitList.get(2));
		
		
	}

}

package genetic;

import java.util.ArrayList;

public class GeneticTest {

	public static void main(String[] args) {
		/*
		 * //ArrayList ��� ArrayList list = new ArrayList();
		 * 
		 * //��� ���� list.add("��"); list.add("��"); list.add("��");
		 * 
		 * //��� �������� String fruit = (String) list.get(2); //Ÿ�� ��ȯ //Ÿ�� ��ȯ�� �ؾ� ��(Object
		 * -> String) System.out.println(fruit);
		 */
		
		//����ƽ ���α׷���
		ArrayList<String> list = new ArrayList<>();
		
		//��� ���� 
		list.add("��"); 
		list.add("��"); 
		list.add("��");
		
		//��� �������� 
		String fruit = (String) list.get(2); //Ÿ�� ��ȯ 
		//Ÿ�� ��ȯ�� �ؾ� ��(Object -> String) 
		System.out.println(fruit);
	}

}

package collection.list;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> vegeList = new ArrayList<>();
		//������ �ְ�, �ߺ� ���
		
		//��ü ����
		vegeList.add("����");
		vegeList.add("����");
		vegeList.add("����");
		
		System.out.println(vegeList); // []�� print
		
		//��ü ����
		int number = vegeList.size();
		System.out.printf("�� ��ü �� : %d��\n", +number);
		
		//Ư�� ��ġ ��ü �߰�
		vegeList.add(2, "����");
		vegeList.add("����");
		
		//��ȸ
		System.out.println(vegeList);
		
		//Ư�� ��ü ��ȸ
		System.out.println("0�� ��ü : "+vegeList.get(0));
		
		//��ü ����
		vegeList.set(1, "����");
		
		//��� ��ȸ
		for(int i=0;i<vegeList.size();i++) {
			String vegetable = vegeList.get(i);
			System.out.println(vegetable);
		}
		System.out.println("==");
		
		//����
		vegeList.remove(3);
		
		//�����ȸ
		for(String v : vegeList) {
			System.out.println(v);
		}
		
		
	}

}

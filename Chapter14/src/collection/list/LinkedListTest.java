package collection.list;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		//���Ḯ��Ʈ
		
		//��ü �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//��ȸ
		System.out.println(myList);
		
		//Ư�� ��ġ�� �߰�
		myList.add(2, "D");
		System.out.println(myList);
		
		//���Ḯ��Ʈ�� �� �ڿ� �߰�
		myList.addLast("E"); //queue�� push()�� ����.
		System.out.println(myList);
		
		//���Ḯ��Ʈ�� �� �տ� ����
		myList.removeFirst(); //�Ű������� ����, queue�� pop()�� ����.
		System.out.println(myList);
		
	}

}

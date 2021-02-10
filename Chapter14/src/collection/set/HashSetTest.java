package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> fruitSet = new HashSet<>(); //�׳� Set���� ������ �ȵǹǷ� new HashSet�� �����������
		
		//��ü����
		fruitSet.add("��"); //1
		fruitSet.add("��"); //2
		fruitSet.add("���"); //3
		fruitSet.add("��"); //4
		fruitSet.add("����"); //5
		fruitSet.add("��"); //6
		
		//��ü ��ȸ
		System.out.println(fruitSet);
		
		//��� ��ȸ(��ȸ)
		Iterator<String> ir = fruitSet.iterator();
		while(ir.hasNext()) { //��ü�� ������ �ִٸ�
			String fruit = ir.next(); //�ϳ��� ������
			System.out.println(fruit);
		}
		
		//��ü ����
		fruitSet.remove("��");
		
		System.out.println(fruitSet);
		System.out.println("������ �� ���� : "+fruitSet.size());
	}

}

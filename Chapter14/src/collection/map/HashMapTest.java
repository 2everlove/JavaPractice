package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>(); // interface���̶� new Map���� ���� �Ұ�
		
		//��ü �߰�
		hashMap.put("���̹�", 300000);
		hashMap.put("īī��", 400000);
		hashMap.put("��������Ʈ", 900000);
		
		System.out.println(hashMap); //hashMap�� toString�����ǰ� �Ǿ� �־ �׳� ����ص� ��°��� ������ {}���·� ǥ��
		
		//�ߺ� �߰�
		hashMap.put("īī��", 500000); //key�� �ߺ��Ұ�, value�� ���氡��
		System.out.println(hashMap);
		
		//Ư�� ��ü�� �� ��������
		System.out.println("���̹� : "+hashMap.get("���̹�"));
		
		System.out.println("===��� ��ȸ===");
		//��� ��� - Set���, Iterator Ŭ���� ��� //map&set�� ������
		Set<String> keySet = hashMap.keySet(); //key ��ü ���
		for(String key : keySet) {
			Integer value = hashMap.get(key);
			System.out.println(key+":"+value);
		}
		/*Iterator<String> ir = keySet.iterator();
		Iterator<String> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next(); //1. key�� ��������
			Integer value = hashMap.get(key); //2. key�� �Ű��� ���� ������
			System.out.println(key+":"+value);
		}*/
		
		
		//��ü ����
		String removeCompany = "���̹�";
		if(hashMap.containsKey(removeCompany)) { //key�� �����Ѵٸ�
			hashMap.remove(removeCompany); //�ش� key�� ����
		}
		hashMap.put("�Ｚ����", 1000000);
		System.out.println(hashMap);
		
	}

}

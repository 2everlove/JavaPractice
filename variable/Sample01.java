package variable;

import java.text.DecimalFormat;

public class Sample01 {

	public static void main(String[] args) {
		// ���� ����ϱ�
		char ch = 'm'; //���� ����� �ʱ�ȭ (������ ���� ch ����� �� 'm'�� ����)
		ch ='L';
		
		int price = 15000; //������ ���� price ���� �� 15000 ����
		System.out.println(ch + "������, "  + price +"��"); // '+'�� ���Ῥ����
		
		DecimalFormat myFormatter = new DecimalFormat("###,###");
		System.out.println(myFormatter.format(price)+"��");
		

		
		// ���ڿ� ���� ���
		String name = "�����";
		name = "���κ�";
		name = "�̾���";

		System.out.println(name);
	}

}

package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {  //�⺻ ������ - �Ű������� ������ ��������
		// System.out.println("����� ������\n"); //�갡 ���� ��µ�
	
	}
	
	public Person(String na) {  //�ܺο��� �Է�(����) ����
		name = na;
	}
	
	public Person(String na, float hei, float wei) {  //�ܺο��� �Է�(����) ����
		name = na; //�ܺκ����� �ʱ�ȭ
		height = hei;
		weight = wei;
	}
	
	//���� ��� method
	public void showInfo() {
		System.out.println("�̸� : "+ name + "\nŰ : "+height+"\n������ : "+ weight + "\n");
	}
}


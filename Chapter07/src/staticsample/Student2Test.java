package staticsample;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2();
		System.out.println(Student2.serialNum);
		Student2 jang = new Student2(); //�л� 1�� �߰� ����
		lee.setName("�̾���");
		jang.setName("��׷�");
		
		//static�� �پ������� Ŭ������ ���� ����Ѵ�.(�ν��ͽ��� ������� ����)
		
		System.out.println(Student2.serialNum);
		
		Student2 kim = new Student2();
		kim.setName("�����");
		System.out.println(Student2.serialNum);
		
	}

}

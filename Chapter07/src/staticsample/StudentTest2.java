package staticsample;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2();
		
		System.out.println(Student2.serialNum);
		
		Student2 jang = new Student2(); //�л� 1�� �߰� ����
		Student2 kim = new Student2(); //�л� 1�� �߰� ����
		
		lee.setName("�̾���");
		
		System.out.println(Student2.serialNum);
		
		jang.setName("��׷�");
		kim.setName("��ġ������");
		
		//static�� �پ������� Ŭ������ ���� ����Ѵ�.(�ν��ͽ��� ������� ����)
		
		System.out.println(lee.name+" �й� : "+lee.studentID);
		System.out.println(jang.name+" �й� : "+jang.studentID);
		System.out.println(kim.getName()+" �й� : "+kim.studentID);
		
	}

}

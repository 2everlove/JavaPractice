package staticsample;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		Student jang = new Student();
		lee.setName("�̾���");
		jang.setName("��׷�");
		
		//�ν��Ͻ������� ������� ����
		System.out.println(lee.serialNum);
		
		lee.serialNum++;

		System.out.println(lee.serialNum);
		
		System.out.println(jang.serialNum);
		
	}

}

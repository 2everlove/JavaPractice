package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// �л� Ŭ���� ����ϱ�
		Student student = new Student();  //student �ν��Ͻ� ����
		//Ŭ���� �ν��Ͻ� = ������
		//Student Ŭ�����̸鼭 �ڷ���(type)�̴�.
		
		student.studentID = 101;
		System.out.println(101==student.studentID);
		
		student.name = "ȫ�浿";
		student.grade = 3;
		student.address = "����� ���α�";
		
		System.out.println(student.studentID);
		System.out.println(student.grade);
		System.out.println(student.address);
		
		student.showInfo();
	}

}

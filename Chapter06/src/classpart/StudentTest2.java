package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// �л� Ŭ���� ����ϱ�
		Student std1 = new Student();  //student �ν��Ͻ� ����
		Student std2 = new Student();  //student �ν��Ͻ� ����
		//Ŭ���� �ν��Ͻ� = ������
		//Student Ŭ�����̸鼭 �ڷ���(type)�̴�.
		
		std1.studentID = 1001;
		
		System.out.println(1001==std1.studentID);
		
		std1.name = "ȫ�浿";
		std1.grade = 3;
		std1.address = "����� ���α�";
		
		std2.name = "ȫ�浿";
		std2.grade = 3;
		std2.address = "����� ���α�";
	
		
		std1.showInfo(); //�޼ҵ� ȣ��
		std2.showInfo();
		
		System.out.println(std1.grade == std2.grade);
	}

}

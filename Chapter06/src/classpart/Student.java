package classpart;

public class Student { //�л� Ŭ����
	int studentID; //�й�
	String name; //�̸�
	int grade;
	String address;
	
	public Student() { //�⺻ �������̹Ƿ� ���� ����
		
	}
	
	public Student(int num) { //�⺻ �������̹Ƿ� ���� ����
		studentID = num;
	}
	
	//�޼��� ����� - showInfo()
	public void showInfo() {
		System.out.println("�й� : " + studentID);
		System.out.println("�̸� : " + name);
		System.out.println("�г� : " + grade);
		System.out.println("�ּ� : " + address);
	}

}

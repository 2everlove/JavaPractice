package hiding;

public class Student {
	int studentID;
	private String name;
	int grade;
	String address;
	
	public Student() { //�⺻ ������ - �Ű����� ������ ��������
		
	}

	public void setName(String name) { //set + ��������̸�(ù���� �빮��)
		this.name = name;
		//���� Ŭ���� �����̹Ƿ� ��밡��
	}	
	
	public String getName() { //get + ��������̸�(ù���� �빮��)
		return name;
	}
}

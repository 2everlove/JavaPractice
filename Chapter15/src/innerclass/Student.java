package innerclass;

public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	class Score{ //Score Ŭ���� - ���� Ŭ����
		int eng;
		int math;
		
		public Score(int eng, int math) {
			this.eng = eng;
			this.math = math;
		}
		
		public void showInfo() {
			System.out.println("�̸� : "+name);
			System.out.println("���� : "+eng);
			System.out.println("���� : "+math);
		}
	}
}

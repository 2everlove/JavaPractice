package innerclass;

public class Student {
	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	class Score{ //Score 클래스 - 내부 클래스
		int eng;
		int math;
		
		public Score(int eng, int math) {
			this.eng = eng;
			this.math = math;
		}
		
		public void showInfo() {
			System.out.println("이름 : "+name);
			System.out.println("영어 : "+eng);
			System.out.println("수학 : "+math);
		}
	}
}

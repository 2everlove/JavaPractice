package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 학생 클래스 사용하기
		Student student = new Student();  //student 인스턴스 생성
		//클래스 인스턴스 = 생성자
		//Student 클래스이면서 자료형(type)이다.
		
		student.studentID = 101;
		System.out.println(101==student.studentID);
		
		student.name = "홍길동";
		student.grade = 3;
		student.address = "서울시 구로구";
		
		System.out.println(student.studentID);
		System.out.println(student.grade);
		System.out.println(student.address);
		
		student.showInfo();
	}

}

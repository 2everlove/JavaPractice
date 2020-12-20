package classpart;

public class StudentTest2 {

	public static void main(String[] args) {
		// 학생 클래스 사용하기
		Student std1 = new Student();  //student 인스턴스 생성
		Student std2 = new Student();  //student 인스턴스 생성
		//클래스 인스턴스 = 생성자
		//Student 클래스이면서 자료형(type)이다.
		
		std1.studentID = 1001;
		
		System.out.println(1001==std1.studentID);
		
		std1.name = "홍길동";
		std1.grade = 3;
		std1.address = "서울시 구로구";
		
		std2.name = "홍길동";
		std2.grade = 3;
		std2.address = "서울시 구로구";
	
		
		std1.showInfo(); //메소드 호출
		std2.showInfo();
		
		System.out.println(std1.grade == std2.grade);
	}

}

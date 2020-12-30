package staticsample;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2();
		
		System.out.println(Student2.serialNum);
		
		Student2 jang = new Student2(); //학생 1명 추가 생성
		Student2 kim = new Student2(); //학생 1명 추가 생성
		
		lee.setName("이양파");
		
		System.out.println(Student2.serialNum);
		
		jang.setName("장그레");
		kim.setName("김치마시쩡");
		
		//static이 붙어있으면 클래스를 직접 사용한다.(인스터스를 사용하지 않음)
		
		System.out.println(lee.name+" 학번 : "+lee.studentID);
		System.out.println(jang.name+" 학번 : "+jang.studentID);
		System.out.println(kim.getName()+" 학번 : "+kim.studentID);
		
	}

}

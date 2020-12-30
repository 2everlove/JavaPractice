package staticsample;

public class Student2Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student2 lee = new Student2();
		System.out.println(Student2.serialNum);
		Student2 jang = new Student2(); //학생 1명 추가 생성
		lee.setName("이양파");
		jang.setName("장그레");
		
		//static이 붙어있으면 클래스를 직접 사용한다.(인스터스를 사용하지 않음)
		
		System.out.println(Student2.serialNum);
		
		Student2 kim = new Student2();
		kim.setName("김대한");
		System.out.println(Student2.serialNum);
		
	}

}

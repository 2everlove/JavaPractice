package staticsample;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		Student jang = new Student();
		lee.setName("이양파");
		jang.setName("장그레");
		
		//인스턴스형으로 사용하지 않음
		System.out.println(lee.serialNum);
		
		lee.serialNum++;

		System.out.println(lee.serialNum);
		
		System.out.println(jang.serialNum);
		
	}

}

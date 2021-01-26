package object.tostring;

class Student{
	String name;
	int studentNum;
	
	public Student(String name, int studentNum) {
		this.name = name;
		this.studentNum = studentNum;
	}

	@Override
	public String toString() {
		return name+", "+studentNum;
	}
}

public class StudentTest {
	public static void main(String[] args) {
		Student a1 = new Student("¹ÚÇÏ´Ã", 2020);
		System.out.println(a1);
	}
	
}

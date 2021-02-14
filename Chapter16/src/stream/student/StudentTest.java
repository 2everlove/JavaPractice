package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("박하늘",95),
				new Student("이하이",80),
				new Student("안민상",100)
				);
		
		//Student class로부터 String 객체 얻어오기
		Stream<Student> stream = list.stream();
		stream.map(s->s.getName()).forEach(s->System.out.println(s));
		
		System.out.println("==90점 이상인 학생==");
		stream = list.stream(); //새로 stream 생성
		stream.filter(s->s.getScore()>=90).map(s->s.getName()).forEach(s->System.out.println(s));
		
		stream = list.stream(); //새로 stream 생성
//		list.stream().forEach(student -> { //바로 하면 Stream import 필요없음
		
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name+", "+score);
		});
		
		
		//stream 생성 방법2
		list.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		System.out.println("===90점이상 오름차순===");
		list.stream().filter(s->s.getScore()>=90).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}

}

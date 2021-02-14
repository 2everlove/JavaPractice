package stream.student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
				new Student("���ϴ�",95),
				new Student("������",80),
				new Student("�ȹλ�",100)
				);
		
		//Student class�κ��� String ��ü ������
		Stream<Student> stream = list.stream();
		stream.map(s->s.getName()).forEach(s->System.out.println(s));
		
		System.out.println("==90�� �̻��� �л�==");
		stream = list.stream(); //���� stream ����
		stream.filter(s->s.getScore()>=90).map(s->s.getName()).forEach(s->System.out.println(s));
		
		stream = list.stream(); //���� stream ����
//		list.stream().forEach(student -> { //�ٷ� �ϸ� Stream import �ʿ����
		
		stream.forEach(student -> {
			String name = student.getName();
			int score = student.getScore();
			System.out.println(name+", "+score);
		});
		
		
		//stream ���� ���2
		list.stream().map(s->s.getName()).forEach(s->System.out.println(s));
		System.out.println("===90���̻� ��������===");
		list.stream().filter(s->s.getScore()>=90).map(s->s.getName()).sorted().forEach(s->System.out.println(s));
	}

}

package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
//		Class strClass = Class.forName("java.lang.String");
		Class strClass = Class.forName("classexam.Person");
		System.out.println(strClass.getName());
		
		System.out.println("\n**** 모든 생성자 정보 가져오기 ****");
		@SuppressWarnings("rawtypes")
		Constructor[] cons = strClass.getConstructors();
		
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("\n**** 모든 멤버 변수(필드) 가져오기 ****");
		Field[] fields = strClass.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("\n**** 모든 메서드 가져오기 ****");
		Method[] methods = strClass.getDeclaredMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}

}

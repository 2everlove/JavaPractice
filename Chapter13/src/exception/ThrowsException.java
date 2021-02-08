package exception;

public class ThrowsException {
	
	public Class<?> loadClass(String className) throws ClassNotFoundException { //throw 예외처리 미뤄놓기
		Class<?> c = Class.forName(className);
		return c;
	}
	
	

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("java.lang.String"); //호출할 때 예외 처리(try~catch)
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("수행 완료!!");
	}

}

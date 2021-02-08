package exception;

public class ThrowsException {
	
	public Class<?> loadClass(String className) throws ClassNotFoundException { //throw ����ó�� �̷����
		Class<?> c = Class.forName(className);
		return c;
	}
	
	

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("java.lang.String"); //ȣ���� �� ���� ó��(try~catch)
		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("���� �Ϸ�!!");
	}

}

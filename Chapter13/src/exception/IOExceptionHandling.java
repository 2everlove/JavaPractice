package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IOExceptionHandling {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//�ܺ����� loading
		
		try {
			@SuppressWarnings("unused")
			FileInputStream fis = new FileInputStream("data.txt");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println(e);
		}System.out.println("���� �Ϸ�");
		
	}

}

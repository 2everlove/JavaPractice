package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExceptionHandling2 {

	public static void main(String[] args) {
		//�ܺ����� loading - ���� catch�� 
		FileInputStream fis = null;
		try { //throw �� ���� ������ try-catch�ؾ���
//			FileInputStream fis = new FileInputStream("data.txt");
			fis = new FileInputStream("data.txt");
			int i;
			while((i=fis.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // ���� exception Ŭ������ �Ʒ��� ��ġ
			e.printStackTrace();
		} finally { //�ݵ�� ���� - �ܺ� ��ġ ��Ʈ��ũ���� �ݵ�� close�ؾ���
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

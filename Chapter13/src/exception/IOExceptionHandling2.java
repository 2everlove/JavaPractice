package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExceptionHandling2 {

	public static void main(String[] args) {
		//외부파일 loading - 다중 catch문 
		FileInputStream fis = null;
		try { //throw 는 연기 어차피 try-catch해야함
//			FileInputStream fis = new FileInputStream("data.txt");
			fis = new FileInputStream("data.txt");
			int i;
			while((i=fis.read()) !=-1) {
				System.out.print((char)i);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) { // 상위 exception 클래스가 아래에 위치
			e.printStackTrace();
		} finally { //반드시 수행 - 외부 장치 네트워크에서 반드시 close해야함
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}

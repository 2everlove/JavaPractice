package Arrayexample;

public class ArrayTest7 {

	public static void main(String[] args) {
		// ���ڿ� �迭 ���� �� ���ĺ� ����
		String[] comLang = new String[4];
		int i;
		//����
		comLang[0] = "Java";
		comLang[1] = "C++";
		comLang[2] = "Python";
		comLang[3] = "Javascript";
		
		//
		for(i=0; i<comLang.length; i++) {
			System.out.println(comLang[i]);
		}
		System.out.println("=============");
		
		//���� for��
		for(String lang : comLang) { //�ڷ��� ����(int or String) : �迭 �̸�
			System.out.println(lang); //��� = ����
		}
		
	}
	

}

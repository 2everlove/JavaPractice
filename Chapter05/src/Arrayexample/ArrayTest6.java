package Arrayexample;

public class ArrayTest6 {

	public static void main(String[] args) {
		// ���ڿ� �迭 ���� �� ���ĺ� ����
		char[] alphabets = new char[26];
		char ch = 'A';
		int i = 0;
		//����
		//alphabets[0] = ch;
//		System.out.println(ch);
		for(i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		for(i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i] + ", " + (int)alphabets[i] );
		}
		//for(i=0; )

//		ch++;
//		System.out.println(ch);
	}
	

}

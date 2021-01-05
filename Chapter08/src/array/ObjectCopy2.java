package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		//��ü �迭�� ���� - ���� ����
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�̻�1", "����ȣ");
		bookArray1[1] = new Book("�̻�2", "����ȣ");
		bookArray1[2] = new Book("�̻�3", "����ȣ");
		
		//bookArray2�� ����
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//bookArray1�� ��Ҹ� ����
		bookArray1[0].setBookName("�¹���1");
		bookArray1[0].setAuthor("������");
		
		
		//bookArray1 ���
		System.out.println("== bookArray1 ��� ==");
		for(int i=0;i<bookArray1.length; i++) {
			System.out.println(bookArray1[i].showInfo());
		}
		
		//bookArray2 ���
		System.out.println("== bookArray2 ��� ==");
		for(int i=0;i<bookArray2.length; i++) {
			System.out.println(bookArray2[i].showInfo());
		}
	}

}

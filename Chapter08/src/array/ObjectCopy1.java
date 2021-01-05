package array;

public class ObjectCopy1 {

	public static void main(String[] args) {
		//��ü �迭�� ����
		Book[] bookArray1 = new Book[3];
		
		bookArray1[0] = new Book("�̻�1", "����ȣ");
		bookArray1[1] = new Book("�̻�2", "����ȣ");
		bookArray1[2] = new Book("�̻�3", "����ȣ");
		
		Book[] bookArray2 = new Book[3];
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		System.out.println("===bookArray1 == ���");
		for(int i =0; i<bookArray1.length; i++) {
			System.out.println(bookArray1[i].showInfo());
		}
		
		System.out.println("===bookArray2 == ���");
		for(int i =0; i<bookArray2.length; i++) {
			System.out.println(bookArray2[i].showInfo());
		}
		System.out.println("===bookArray2�� enhanced for print");
		for (Book a : bookArray2) {
			System.out.println(a.showInfo());
		}
	}

}

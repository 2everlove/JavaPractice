package object.equals;

public class Book {
	int bookNumber; //å ��ȣ
	String bookTitle; //å ����
	
	public Book(int bookNumber, String bookTitle) {
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
//	public void showInfo() {
//		System.out.println(bookNumber+", "+bookTitle);
//	}
//	
//	public String showI() {
//		return bookNumber+", "+bookTitle;
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return bookNumber+", "+bookTitle;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) { //obj �� book�� �ν��Ͻ��̸�
			Book book = (Book)obj; //obj�� book���� �ٿ�ĳ����(����ȯ)
			if (this.bookTitle.equals(book.bookTitle) && this.bookNumber == book.bookNumber) 
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() { // �ؽ��ڵ� method ������
		return bookNumber;
	}
	
	
	
}

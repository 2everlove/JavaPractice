package object.tostring;

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
}

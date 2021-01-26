package object.equals;

public class Book {
	int bookNumber; //책 번호
	String bookTitle; //책 제목
	
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
		if(obj instanceof Book) { //obj 가 book의 인스턴스이면
			Book book = (Book)obj; //obj를 book으로 다운캐스팅(형변환)
			if (this.bookTitle.equals(book.bookTitle) && this.bookNumber == book.bookNumber) 
				return true;
		}
		return false;
	}

	@Override
	public int hashCode() { // 해쉬코드 method 재정의
		return bookNumber;
	}
	
	
	
}

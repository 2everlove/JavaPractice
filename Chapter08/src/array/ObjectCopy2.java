package array;

public class ObjectCopy2 {

	public static void main(String[] args) {
		//객체 배열의 복사 - 얕은 복사
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("미생1", "윤태호");
		bookArray1[1] = new Book("미생2", "윤태호");
		bookArray1[2] = new Book("미생3", "윤태호");
		
		//bookArray2에 복사
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		//bookArray1의 요소를 수정
		bookArray1[0].setBookName("태백산맥1");
		bookArray1[0].setAuthor("조정래");
		
		
		//bookArray1 출력
		System.out.println("== bookArray1 출력 ==");
		for(int i=0;i<bookArray1.length; i++) {
			System.out.println(bookArray1[i].showInfo());
		}
		
		//bookArray2 출력
		System.out.println("== bookArray2 출력 ==");
		for(int i=0;i<bookArray2.length; i++) {
			System.out.println(bookArray2[i].showInfo());
		}
	}

}

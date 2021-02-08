package exception.thrownew;

public class IDFormatTest {
	
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}
	//조건 - ID가 null이 아니거나, 글자수가 8자 이상 20자 이하로 함
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하이여야 합니다.");
		} else {
			this.userID = userID; //정상인 경우
		}
	}



	public static void main(String[] args) {
		IDFormatTest IF = new IDFormatTest();
		
		String userID="abc123";
		
		try {
			IF.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); //.getMessage() 경로 생략 후 메시지 바로 출력
		}
	}

}

package exception.thrownew;

public class IDFormatTest {
	
	private String userID;
	
	
	public String getUserID() {
		return userID;
	}
	//���� - ID�� null�� �ƴϰų�, ���ڼ��� 8�� �̻� 20�� ���Ϸ� ��
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� �����̿��� �մϴ�.");
		} else {
			this.userID = userID; //������ ���
		}
	}



	public static void main(String[] args) {
		IDFormatTest IF = new IDFormatTest();
		
		String userID="abc123";
		
		try {
			IF.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); //.getMessage() ��� ���� �� �޽��� �ٷ� ���
		}
	}

}

package overide.airplane;

public class SuperSonicAirPlane extends AirPlane {
	
	private static final int NORMAL = 1; //��� ����
	private static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL; //���� ���(1-������,2-�����Ӻ���)
	
	public static int getNormal() {
		return NORMAL;
	}
	public static int getSuperSonic() {
		return SUPERSONIC;
	}
	
	
	@Override
	public void fly() {
		if (flyMode==SUPERSONIC) {
			System.out.println("����Ⱑ ������ �����մϴ�.");
		} else {
			super.fly(); //�θ� method ���
		}
	}
	
	
}

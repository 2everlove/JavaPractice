package overide.airplane;

public class SuperSonicAirPlane extends AirPlane {
	
	private static final int NORMAL = 1; //상수 선언
	private static final int SUPERSONIC = 2;
	
	int flyMode = NORMAL; //비행 모드(1-비행모드,2-초음속비행)
	
	public static int getNormal() {
		return NORMAL;
	}
	public static int getSuperSonic() {
		return SUPERSONIC;
	}
	
	
	@Override
	public void fly() {
		if (flyMode==SUPERSONIC) {
			System.out.println("비행기가 초음속 비행합니다.");
		} else {
			super.fly(); //부모 method 상속
		}
	}
	
	
}

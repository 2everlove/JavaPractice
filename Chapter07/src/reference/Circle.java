package reference;

public class Circle {
	Point center;
	int radius;
	
	public Circle(int x, int y, int radius) {
		center = new Point(x, y); //점 생성됨
		this.radius = radius;
	}
	
	//원의 정보 출력 메서드
	public void showInfo() {
		System.out.println("원의 중심은("+center.x+", "+center.y+")이고, "
				+ "반지름은 "+radius+"입니다.");
	}
}

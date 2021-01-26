package object.clone;

public class Circle implements Cloneable{
	Point center; //중심점 - 참조자료형
	int radius; //반지름
	
	public Circle(int x, int y, int radius) {
		center = new Point(x,y);
		this.radius = radius;
		
		
	}

	@Override
	public String toString() {
		return "중심점 : "+center+"\n반지름 : "+radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

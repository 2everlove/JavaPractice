package object.clone;

public class Circle implements Cloneable{
	Point center; //�߽��� - �����ڷ���
	int radius; //������
	
	public Circle(int x, int y, int radius) {
		center = new Point(x,y);
		this.radius = radius;
		
		
	}

	@Override
	public String toString() {
		return "�߽��� : "+center+"\n������ : "+radius;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

package genetic.box2;

public class Box<T> { //파라미터 자료형
	private T type;
	
	public T getBox() {
		return type;
	}
	public void setBox(T type) {
		this.type = type;
	}
	
}

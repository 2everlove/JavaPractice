package genetic.product;

public class Product<T, M> {
	private T kind; //타입 종류
	private M model; //타입 모델
	
	public T getKind() {
		return kind;
	}
	public M getModel() {
		return model;
	}
	
	public void setKind(T kind) {
		this.kind = kind;
	}
	public void setModel(M model) {
		this.model = model;
	}
}

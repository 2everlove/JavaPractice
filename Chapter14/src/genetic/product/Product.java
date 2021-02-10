package genetic.product;

public class Product<T, M> {
	private T kind; //Ÿ�� ����
	private M model; //Ÿ�� ��
	
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

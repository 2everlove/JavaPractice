package genetic.threedprinter;

public class GeneticPrinter<T> { //T�� ������Ʈ�� ��������! ������ ���� �� ������
	private T material; //���� -powder,plastic ����
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//�����ǰ� �ƴϰ� plastic class�� toString method ȣ��
	public String toString() {
		return material.toString();
	}
	
}

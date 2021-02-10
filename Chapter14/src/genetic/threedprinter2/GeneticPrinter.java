package genetic.threedprinter2;

public class GeneticPrinter<T extends Material> { //T�� ������Ʈ�� ��������! ������ ���� �� ������
	private T material; //���� -powder,plastic ����
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public void doPrinting() {
		material.doPrinting();
	}
}

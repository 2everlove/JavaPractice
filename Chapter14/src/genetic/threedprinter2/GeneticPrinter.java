package genetic.threedprinter2;

public class GeneticPrinter<T extends Material> { //T를 오브젝트라 생각하자! 뭐든지 담을 수 있으니
	private T material; //물질 -powder,plastic 가정
	
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

package genetic.threedprinter;

public class GeneticPrinter<T> { //T를 오브젝트라 생각하자! 뭐든지 담을 수 있으니
	private T material; //물질 -powder,plastic 가정
	
	public T getMaterial() {
		return material;
	}
	public void setMaterial(T material) {
		this.material = material;
	}
	
	//재정의가 아니고 plastic class의 toString method 호출
	public String toString() {
		return material.toString();
	}
	
}

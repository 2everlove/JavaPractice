package genetic.threedprinter;

public class PrinterTest {

	public static void main(String[] args) {
		GeneticPrinter<Plastic> plasticPrinter = new GeneticPrinter<>();
		
		plasticPrinter.setMaterial(new Plastic()); //Plastic = new Plastic();과 비슷함
		System.out.println(plasticPrinter); //GeneticPrinter class의 toString을 호출
		
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plastic);
		
		
		
		GeneticPrinter<Powder> powderPrinter = new GeneticPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);
	}

}

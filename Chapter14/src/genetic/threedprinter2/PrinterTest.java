package genetic.threedprinter2;

public class PrinterTest {

	public static void main(String[] args) {
		//plastic 재료
		GeneticPrinter<Plastic> plasticPrinter = new GeneticPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		plasticPrinter.doPrinting();
		
		//powder 재료
		GeneticPrinter<Powder> powderPrinter = new GeneticPrinter<>();
		powderPrinter.setMaterial(new Powder());
		powderPrinter.doPrinting();
	}

}

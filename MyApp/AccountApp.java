import java.util.Scanner;

public class AccountApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        double ValueOfSupply = scan.nextDouble();
        double vatRate = 0.1;
        double expenseRate = 0.3;
        double VAT = ValueOfSupply*vatRate;
        double Total = ValueOfSupply + ValueOfSupply*vatRate;
        double Expense = ValueOfSupply*expenseRate;
        double Income = ValueOfSupply - Expense;
        double dividend1 = Income * 0.5;
        double dividend2 = Income * 0.3;
        double dividend3 = Income * 0.2;

        System.out.println("Value of supply : "+ValueOfSupply);        
        System.out.println("VAT : "+ VAT );
        System.out.println("Total : "+ Total );
        System.out.println("Expanse : "+ Expense );
        System.out.println("Income : "+ Income );
        System.out.println("Dividend 1 : "+ dividend1 );
        System.out.println("Dividend 2 : "+ dividend2 );
        System.out.println("Dividend 3 : "+ dividend3 );
    }
}

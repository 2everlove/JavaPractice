import java.util.Scanner;

public class AccountClass {
    public static double ValueOfSupply;
    public static double vatRate;
    public static double expenseRate;
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);

        ValueOfSupply = scan.nextDouble();
        vatRate = 0.1;
        expenseRate = 0.3;

        /*
        double VAT = getVAT();
        double Total = getTotal();
        double Expense = getExpense();
        double Income = getIncome();
        */

        double[] dividendRates = new double[3];
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        double[] dividendMinorRates = new double[3];
        dividendMinorRates[0] = 1.0;
        dividendMinorRates[1] = 0.0;
        dividendMinorRates[2] = 0.0;
        
        print();

        if(getIncome() > 10000.0) {        
            int i = 0;
            while(i < dividendRates.length) {
                System.out.println("Dividend"+(i+1)+" : " + (getIncome()*dividendRates[i]));
                i = i + 1;
            }
        }  else {
            int i = 0;
            while(i < dividendMinorRates.length) {
                System.out.println("Dividend"+(i+1)+" : " + (getIncome()*dividendMinorRates[i]));
                i = i + 1;
            }
        }     
        scan.close();
    }

    private static void print() {
        System.out.println("Value of supply : "+ValueOfSupply);        
        System.out.println("VAT : "+ getVAT() );
        System.out.println("Total : "+ getTotal() );
        System.out.println("Expanse : "+ getExpense() );
        System.out.println("Income : "+ getIncome() );
    }

    private static double getIncome() {
        return ValueOfSupply - getExpense();
    }

    private static double getExpense() {
        return ValueOfSupply*expenseRate;
    }

    private static double getTotal() {
        return ValueOfSupply + getVAT();
    }

    private static double getVAT() {
        return ValueOfSupply*vatRate;
    }
}

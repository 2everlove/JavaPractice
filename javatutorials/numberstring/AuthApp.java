import java.util.Currency;

public class AuthApp {
    public static void main(String[] args) {
        //String[] users = {"apple", "banana", "carrot"};
        String [] [] users = {
            {"apple", "1111"},
            {"banana", "2222"}, 
            {"carrot", "3333"}
        };
        String inputId = args[0];
        String inputPass = args[1]; // before run, set arguments from configuration

        boolean isLogined = false;
        for(int i=0; i<users.length; ++i) {
            String[] current = users[i];
            if(current[0].equals(inputId) && current[1].equals(inputPass)) {
               isLogined = true;
               break;
            }
        }
        System.out.println("Hi,");
        if(isLogined) {
            System.out.println(inputId+" Master!!");
        } else {
            System.out.println("Who is "+inputId+"?");
        }
    }
    
}

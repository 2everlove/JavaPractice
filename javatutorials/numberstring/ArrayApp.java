public class ArrayApp {
    public static void main(String[] args) {
        String[] users = new String[3];
        users[0] = "apple";
        users[1] = "banana";
        users[2] = "carrot";

        System.out.println(users[1]);
        System.out.println(users.length); //3칸
        
        int[] score = {10, 100, 100};
        System.out.println(score[1]);
        System.out.println(score.length);
    }
    
}

package others;
import java.util.Scanner;

public class VotingApp {
    public static void main(String[] args) {
        System.out.println("enter age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        boolean condition = age >= 18;
        if (condition){
            System.out.println("eligible for vote");
           
        }else{
            System.out.println("not eligible for vote");
        }
        System.out.println("Thank u ");

    }

}

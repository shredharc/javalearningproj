package others;
import java.util.Scanner;

public class BestDeal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter product1 grams");
       
        int p1grams = scanner.nextInt();
        System.out.println("enter product1 rupees");
        int p1rupees = scanner.nextInt();
        System.out.println("enter product2 grams");
       
        int p2grams = scanner.nextInt();
        System.out.println("enter product2 rupees");
        int p2rupees = scanner.nextInt();
        int intRes = p2grams*p1rupees/p1grams;
        System.out.println("intRes" + intRes);
        if (intRes < p2rupees){
            System.out.println("p1 is best");

        }else{System.out.println("p2 is best");}
        /*int saving = intRes - p2rupees;
        System.out.println("ur savings" + saving);*/
    }

}

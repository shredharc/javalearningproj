package others;
import java.util.Scanner;

public class NumberInWords {
    public static void main(String[] args) {
        System.out.println("enter a number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String one = " one ";
        if (number == 0 ){
            System.out.println( " zero ");
           

        } 
        
       
        if (number >= 21 && number <= 29){
            System.out.print( " twenty " );
            int onesplace = number % 10 ;
            if (onesplace == 1){
                System.out.println(" one ");
               
            
        }   if (onesplace  == 2){
            System.out.println(" two ");
        }   if (onesplace == 3){
            System.out.println(" three ");
        } if (onesplace == 4){
            System.out.println(" four ");
        } if (onesplace == 5){
            System.out.println(" five ");
        } if (onesplace == 6){
            System.out.println(" six ");
        } if (onesplace == 7){
            System.out.println(" seven ");
        } if (onesplace == 8){
            System.out.println(" eight ");
        } if (onesplace == 9){
            System.out.println(" nine ");

        }
        }
}
}



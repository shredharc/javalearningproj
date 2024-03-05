package others;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println("enter year");
        Scanner scanner = new Scanner(System.in);
        int leapyear = scanner.nextInt();
        int rem = leapyear%4;
        if (rem == 0){
            System.out.println("its a leap year");
        }else{
            System.out.println("not a leap year");
        }
        
        

        
    }

}

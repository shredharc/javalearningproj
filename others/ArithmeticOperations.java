package others;
import java.util.Scanner;

public class ArithmeticOperations 
{
    public static void main(String a[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter num1");
    int num1 = scanner.nextInt(); 
    System.out.println("enter num2"); 
    int num2 = scanner.nextInt();
    int add = num1+num2;
    System.out.println("addition is" + add); 
    int sub = num1-num2;
    System.out.println("subtraction is" + sub); 
    int mul = num1*num2;
    System.out.println("multiplication is" + mul); 
    float div =(float) num1/num2;
    System.out.println("divison is" + div);
    String formattedNumber = String.format("%.2f", div);
    System.out.println(formattedNumber); 
    int rem = num1%num2;
    System.out.println("remaiander is" + rem); 

    }
}

package others;
import java.util.Scanner;

public class PassOrFail {
public static void main(String[] args) {
    System.out.println("enter marks");
    Scanner scanner = new Scanner(System.in);
    int marks = scanner.nextInt();
    boolean x = marks>=35;
    if (x){
        System.out.println("pass");
    }else{
        System.out.println("fail");
    }

}
}

package others;
import java.util.Scanner;

public class UserInput
 {
   public static void main(String a[]){
    System.out.println("enter ur name");
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    System.out.println("enter your age");
   

    int age = scanner.nextInt(); //stores given input in to variable age

    System.out.println("hello" + name);
    System.out.println("age" + age);
    int y = 2024-age;
    System.out.println("you born on" + y);

   }
}

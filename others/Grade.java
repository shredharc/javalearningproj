package others;
import java.util.Scanner;

public class Grade {
    public static void main(String a[]){
        System.out.println("enter marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        if (marks > 100 || marks < 0){
            System.out.println("invalid marks");
        }
        else if (marks>=75&marks<=100){
            System.out.println("destinction");

        }else if(marks>=60){
            System.out.println("A grade");

        }else if(marks>=40){
            System.out.println("B grade");

        }else if(marks<30){
            System.out.println("fail");
        }
    }
}

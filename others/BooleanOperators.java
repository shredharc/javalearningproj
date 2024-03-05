package others;
import java.util.Scanner;

public class BooleanOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("x value:");
        int x = scanner.nextInt();
        System.out.println("y value:");
        int y = scanner.nextInt();
        
        boolean h = x>y;
        System.out.println("x greater than y:" + h);
        boolean k = x<y;
        System.out.println("x less than y:" + k);

       
        boolean a = x>=y;
        System.out.println("greater than or equal to:" + a);
        boolean b = x<=y;
        System.out.println("less than or eual to:" + b);
        boolean p = x==y; 
        System.out.println("x equal to y:" + p);
        boolean r = x!=y;
        System.out.println("x not equal to y:" + r);
    }
}

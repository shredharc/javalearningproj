package others;
import java.util.Scanner;

public class AreaofTraingle {
    public static void main(String a[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("length of traingle:");
        int l = scanner.nextInt();
        System.out.println("breadth of traingle:");
        int b = scanner.nextInt();
        int area = l * b;
        boolean condition = false;
        if (condition) {
            System.out.println("area" + area);
        }
        int x = 2 * (l + b);
        System.out.println("perimeter" + x);
    }
}

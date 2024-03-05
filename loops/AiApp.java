package loops;

import java.util.Scanner;

public class AiApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i<=5){
            String x = scanner.next();

            System.out.println(x);

            i++;
        }
    }
}

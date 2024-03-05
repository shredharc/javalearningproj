package loops;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        System.out.println("enter from number ?");
        System.out.println(" enter to number ? ");
        try (Scanner scanner = new Scanner(System.in)) {
        int fromnumber = scanner.nextInt();
            int tonumber = scanner.nextInt();

            if (fromnumber > tonumber) {
                int temp;
                temp = fromnumber;
                fromnumber = tonumber;
                tonumber = temp;

            }
            while (fromnumber <= tonumber) {
                int reminder = fromnumber % 2;
                if (reminder == 0) {
                    System.out.println(fromnumber);
                }
                fromnumber = fromnumber + 1;
            }
        }
    }
}

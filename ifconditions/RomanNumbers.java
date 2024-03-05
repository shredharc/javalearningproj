package ifconditions;

import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        System.out.println("enter a decimal number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        char num1 = 'I';
        char num2 = 'V';
        char num3 = 'X';
        if (num == 1) {
            System.out.println(num1);
        } else if (num == 2 || num == 3) {
            int i = 1;
            while (i <= num) {
                System.out.print(num1);
                i++;
            }
        } else if (num == 4) {
            System.out.print(num1);
            System.out.println(num2);
        } else if (num == 5) {
            System.out.println(num2);
        } else if (num == 6 || num == 7 || num == 8) {
            int i = 5;
            System.out.print(num2);
            while (i < num) {
                System.out.print(num1);
                i++;
            }
        } else if (num == 9) {
            System.out.println(num1 + "" + num3);
        } else if (num == 10) {
            System.out.println(num3);
            
        }  else if (num == 11 || num == 12 || num == 13) {
            int i = 10;
            System.out.print(num3);
            while (i < num) {
                System.out.print(num1);
                i++;
            }

        }

    }
}
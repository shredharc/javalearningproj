package arrays;

import java.util.Scanner;

public class MathTable {
    public static void main(String[] args) {
        System.out.println("enter number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] m = new int[100];
        int j = 0;
        // storing
        while (j < m.length) {
            m[j] = j + 1;
            j++;
        }
        // printing array
        int k = 0;
        while (k < m.length) {
            System.out.print(m[k]);
            k++;
        }

        System.out.println("-----------------");
        j = 0;
        // printing of table

        while (j < m.length) {
            System.out.println(num * m[j]);
            j++;
        }

        System.out.println("sreedhar math table:");
        // print table simple logic
        int x = 0;
        while (x < 10) {
            x++;
            System.out.print(num);
            System.out.print("X");
            System.out.print(x);
            System.out.println("=" + num * x);

        }

    }

}

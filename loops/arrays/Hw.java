package loops.arrays;

import java.util.Scanner;



public class Hw {
    public static void main(String[] args) {
       System.out.println(20>20);
        System.out.println("How Many Elements u Want(MAX is 20):");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();

        while (y>20||y<=0) {
            System.out.println("Invalid Number, Try Again");
              y = scanner.nextInt();
        }

        int[] x = new int[y];
        int i=0;
        while (i<x.length) {
            System.out.println("Enter An Element:");
            int Element = scanner.nextInt();
            x[i] = Element;
            i++;
            
        }
        int j = 0;
        while (j<x.length) {
            System.out.println(x[j]);
            j++;
        }
      }

}

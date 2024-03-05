package arrays;

import java.util.Scanner;

public class DataScience {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int [] x = new int[3] ;
        while (i < x.length) {
            /* System.out.println("enter month: ");
            String month = scanner.next(); */
            System.out.println("enter no of fans purchased:");
            int fans = scanner.nextInt();
            x[i]=fans;
           
            i++;

        }
        i=0;
        System.out.println("\nlist of elements:");
        while (i < x.length) {
            System.out.println(x[i]);
            i++;
        }

    }
}

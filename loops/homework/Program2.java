package loops.homework;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int [] x= {10,20,30,40,15,60,70,80,90,100};
        int j = 0;
        int num = 15; //element to find
        boolean s = false;
        while (j<x.length) {
            if (num==x[j]) {
                System.out.println("yes");
                s = true;
                break;
            }
            j++;
        }
        if (s==false) {
            System.out.println("false element not found");
            
        }
    }
}


package ifconditions;

import java.util.Scanner;

public class WishingApp {
    public static void main(String[] args) {
        System.out.println(" enter time: ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();
        long x = System.currentTimeMillis();
       
        if (time > 24 || time <= 0){
            System.out.println(" invalid time ");
        }else if( time >= 1 && time < 12 ){
            System.out.println(" good morning ");
        }else if (time >= 12 && time < 16){
            System.out.println(" good afternoon ");
        }else if (time >= 16 && time < 19){
            System.out.println(" good evening ");
        }else if (time >= 19 && time <= 24){
            System.out.println(" good night ");
        }


        long y = System.currentTimeMillis();
        System.out.println(x);
        System.out.println(y);
        long z = y-x;
        System.out.println(z);
    }

}

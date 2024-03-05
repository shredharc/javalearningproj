package others;
import java.util.Scanner;

public class SreeFbLastSeen {
    public static void main(String[] args) {
        System.out.println("how many seconds ago photo uploaded");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        //seconds: cas1
        if (seconds <= 59){ //to show in seconds
            System.out.println(seconds + "seconds ago uploaded" );
        }

        //Minutes: case2
        if (seconds>=60 && seconds <=3600) {
            int minutes = seconds/60;
            if ( minutes <= 1){
                System.out.println( minutes + " minute ago ");
            }else {
                System.out.println( minutes + " minutes ago");
            }
        }

        //Hours: case 3
        









        
        // case 2 :
        /*
        if(seconds >= 60){
            int minutes = seconds/60;
            // is for minutes
            if ( minutes <= 1){
                System.out.println( minutes + " minute ago ");
            }else {

                System.out.println( minutes + " minutes ago");
            }

        }*/
        
    }
}

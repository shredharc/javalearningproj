package others;
import java.util.Scanner;

public class FbLastSeen {
    public static void main(String[] args) {
        System.out.println("how many seconds ago photo uploaded");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        
        if (seconds <= 59){ //to show in seconds
            System.out.println(seconds + "seconds ago uploaded" );
        }

        // case 2
        int minutes = seconds/60;
        System.out.println(minutes);
        if(minutes >= 1 && minutes < 60){
            System.out.println( minutes + " minute(s) ago ");
        }
        
        // case 3 :
        int hours = minutes/60;
        System.out.println(hours);
        if (hours >= 1 && hours < 24 ){
            System.out.println( hours + " hour(s) ago ");
        }
        
        //  case 3:
        int days = hours/24;
        System.out.println(days);
        if ( days >= 1 && days < 7 ){
            System.out.println(days + " day(s) ago ");

        }

        // case 4:
        int weeks = days/7;
        System.out.println(weeks);
        if ( weeks >= 1 && weeks <=4 ){
            System.out.println( weeks + " week(s) ago");        }

        // case 4:
        int months = weeks/4;
        System.out.println(months);
        if (months >= 1 && months < 12){
            System.out.println( months + " month ago ");
        }
        
        // case 5:
        long years = months/12;
        if (years >= 1 ){
            System.out.println(years + " year ago ");
        }


        if (true/false) {
            //
        }
    }

}





/*
 * 
        // case 3:
        int hours = minutes/60;
        if (seconds >= 3600 && seconds < 216000){
            System.out.println( hours + " hour ago ");

        }else {
            System.out.println( hours +" hours ago ");
        }
 */
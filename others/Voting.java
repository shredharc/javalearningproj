package others;
import java.util.Scanner;

public class Voting {
    

public static void main(String a[]){
    long starttime = System.currentTimeMillis();
    System.out.println("enter vote");
    Scanner scanner = new Scanner(System.in);
    String vote = scanner.nextLine();
    int team1 = 0, team2 = 0;
    if ("x".equalsIgnoreCase(vote) ){ //does give vote has x? true or false
        team1 = team1+1;
    } 
    if ("y".equalsIgnoreCase(vote) ){
        team2 = team2+1;  
    }
    vote = scanner.nextLine();
    if ("x".equalsIgnoreCase(vote) ){
        team1 = team1+1;
    } 
    if ("y".equalsIgnoreCase(vote) ){
        team2 = team2+1;  
    }
    System.out.println("team1 votes" +team1);
    System.out.println("team2 votes" +team2);
    if (team1>team2){
        System.out.println("team1 won ");
    }else if(team2>team1){
        System.out.println("team2 won");
    } else {
        System.out.println("tie break super over");
    }
    long endTime = System.currentTimeMillis();
    System.out.println(endTime-starttime);
    //end of main
}

}

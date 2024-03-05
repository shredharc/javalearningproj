package loops;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int j=1;
        while (j<=10) {
            int player2= new Random().nextInt(3)+1;
            System.out.println("enter player 1 input(1.rock, 2.paper, 3.scissor)");
            int player1 = scanner.nextInt();
            if (player1 == 1) {
                System.out.println("player 1="+"Rock");
            } else if(player1 == 2) {
                System.out.println("player 1="+"Paper");
            } else {
                System.out.println("player 1="+"Scissor");
            }

            if (player2 == 1) {
                System.out.println("player 2="+"Rock");
            } else if(player2 == 2) {
                System.out.println("player 2="+"Paper");
            } else {
                System.out.println("player 2="+"Scissor");
            }
            
            if (player2 == 1 && player1 == 1 || player2 == 2 && player1 == 2 || player2 == 3 && player1 == 3) {
                System.out.println("tie break");
            }

            if (player2 == 3 && player1 == 2 || player2 == 2 && player1 == 1 || player2 == 1 && player1 == 3) {
                System.out.println("player2 won");   
            }

            if (player2 == 1 && player1 == 2 || player2 == 2 && player1 == 3 || player2 == 3 && player1 == 1) {
                System.out.println("player1 won");
            }
          
            j++;
        }
        
    }
}

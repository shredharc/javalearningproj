package loops;

import java.util.Scanner;

class AskQuestion{
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                
                while (true) {
                     int x = scanner.nextInt();
                     
                
                     if(x==0) {
                         break;
                     }
                     System.out.println(x);
                    
                }

    }
}
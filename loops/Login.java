package loops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        //user database
        int u1 = 1234;
        int p1 = 4321;
        String u1Name = "Madhav";
        int i=1;


        while(i<=3){

            //reading inputs
            System.out.println("enter ur user id");
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            System.out.println("enter pin");
            int x1 = scanner.nextInt();

            //logic to check username password correctness
            boolean c = x == u1;
            boolean p = x1 == p1;

            //logic to show success or failure
            if(c && p){
                System.out.println("login success");
                System.out.println("hello madhav, welcome");
                 break; // break the loop if success
            }else{
                System.out.println("invalid username or password");
                System.out.println("try again, attempt "+i);
            }
            i++;
        }
        System.out.println("max trys over please reset ur password");

    }
    
}

package others;
import java.util.Scanner;

public class VirtualDoctorApp {
     public static void main(String[] args) {

        System.out.println("do u have any fever");
        Scanner scanner = new Scanner(System.in); //creates scanner object in memory and returns scanners reference
        String fever = scanner.nextLine(); // takes user input, stores in memory and returns reference fever
        String cough, coughtype, cold; // creates two objects in memory
        //fever
        if (fever.equalsIgnoreCase("yes")){
                System.out.println("how much is temperature ?");
                int temp = scanner.nextInt();
                if(temp >= 98.5){
                        System.out.println("paracetemol 650");
                }
        }

        //this is for cough logic
        System.out.println("do u have cough");
        cough = scanner.nextLine();
        if (cough.equalsIgnoreCase("yes")){
                System.out.println("wet cough or dry cough(wet/dry)");
                coughtype  = scanner.nextLine();
                if(coughtype.equalsIgnoreCase("wet")){
                        System.out.println("Cofsil");
                }else{
                        System.out.println("Benadryl DR Syrup");
                }
        
        }
        System.out.println("do u have any cold ?" );
         cold = scanner.nextLine();
         if (cold.equalsIgnoreCase("yes")){
                System.out.println("Algera 500 (tablet)");
         }
        
}
        
        
        

        

       

    
}



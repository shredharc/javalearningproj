package arrays;

import java.util.Scanner;

public class HallTicketApp {
    public static void main(String[] args) {
        int[] hallTicketNo= {1267, 3490, 8462, 2486, 3578, 9512};
        String[] centerName = {"Hyd", "Knl", "Adn", "Ygr", "Bgl", "Vizag"};
        String[] name = {"Sreedhar", "Manas", "Madhav", "Laxmi", "Sriju", "Kempu"};
        String[] gender = {"male", "male", "male", "female", "female", "male"};
        System.out.println("enter hallticket number:");
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int i = 0;
        while (i<hallTicketNo.length) {
           if (r == hallTicketNo[i]) {
            System.out.println("|____________________________________________________|");
            System.out.println("|\t\t APPSC VIJAYAWADA\t\t     |");
            System.out.println("|____________________________________________________|");
            System.out.println("|NAME:"+name[i]+"\t\t\t\t\t|");
            System.out.println("|GENDER:"+gender[i]+"\t\t\t\t\t|");
            System.out.println("|____________________________________________________|");
            System.out.println("|VENUE NAME:"+centerName[i]+"|"+"|Date and time:9:AM to 1:AM|"+"subject:Mentalability    ");
           }
            i++;
           }
            
            
        }

    }


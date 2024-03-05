package others;

import java.util.Scanner;

public class SuperMarketApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter How Many Horlicks u Want:");
        int horshashets = scanner.nextInt();
        System.out.println("Enter How Many Shampoos u Want:");
        int shamshashets = scanner.nextInt();

        System.out.println("Enter How Many PediaSure u Want:");
        int pshashets = scanner.nextInt();
        System.out.println("Enter How Many KG rice u Want:");
        int rycpackets = scanner.nextInt();
        System.out.println("enter how much dal u want(grams):");
        int dalpackets = scanner.nextInt();
        System.out.println("enter how much coconut oil u want(in milli liters):");
        int coconutoil = scanner.nextInt();
        float c = (float)coconutoil/1000*400;
        float d = (float)dalpackets/1000*180;
        int x = horshashets*5;
        int y = shamshashets*2;
        int z = pshashets*30;
        int f = rycpackets*50;
        float tp = c+d+x+y+z+f;
        System.out.println("total price = " + tp);
    
}

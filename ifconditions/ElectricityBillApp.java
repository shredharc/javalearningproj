package ifconditions;

import java.util.Scanner;

public class ElectricityBillApp {
    public static void main(String[] args) {
        System.out.println(" enter starting month units: ");
        System.out.println(" enter month end units: ");
        Scanner scanner = new Scanner(System.in);
        byte startingmonthunits = scanner.nextByte();
        byte monthendunits = scanner.nextByte();
        int difference = monthendunits - startingmonthunits;
        int bill = difference * 3;
        System.out.println(" your electricity bill is:" + bill );
    }
}


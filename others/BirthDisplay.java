package others;
import java.util.Scanner;

public class BirthDisplay {
    public static void main(String[] args) {
        System.out.println("birth year");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int age = 2024 - year;
        System.out.println("ur age is" + age); 
        if (age == 0 || age == 1){
            System.out.println("infant");
        }else if (age >= 2 && age <= 4){
            System.out.println("toodler");
        }else if (age >= 5 && age <= 12){
            System.out.println("child");
        }else if (age >= 13 && age <= 19){
            System.out.println("teen");
        }else if (age >= 20 && age <= 39){
            System.out.println("adult");
        }else if (age >= 40 && age <= 59){
            System.out.println("middle age adult");
        }else if (age >= 60){
            System.out.println("senior adult");
        }

    }

}

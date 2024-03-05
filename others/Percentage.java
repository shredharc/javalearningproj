package others;
import java.net.SocketTimeoutException;
import java.util.Scanner;

class Percentage
{
    public static void main(String a[])
    {
        byte sub1, sub2, sub3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter sub1 marks");

        sub1 =  scanner.nextByte();
        System.out.println("enter sub2 marks");

        sub2 =  scanner.nextByte();
        System.out.println("enter sub3 marks");

        sub3 =  scanner.nextByte();

        int totalMarks = sub1+sub2+sub3;
        float percentage = (float)totalMarks/300*100;
        System.out.print("percentage");
        System.out.println(percentage);
        System.out.print("marks");
        System.out.println(totalMarks);

    } 
}
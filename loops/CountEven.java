package loops;

public class CountEven {
    public static void main(String[] args){
        int [] x = {1, 2, 3, 4, 5, 6, 8, 7};
        int i = 0;
        int c = 0;
        while (i<x.length) {
            if (x[i] % 2 == 0) {
                c++;
            }
            i++;
        }
        System.out.println("Count of even =" + c);
    }
    
}

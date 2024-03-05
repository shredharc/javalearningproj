package loops;

public class Product {
    public static void main(String[] args){
        int [] x = {1, 2, 3, 4, 5, 6, 8, 7};
        int i = 0;
        int p = 1;
        while (i<x.length) {
            if (x[i] % 2 == 0) {
                p = x[i]*p;
            }
            i++;
        }
        System.out.println("product =" + p);
    }
    
}

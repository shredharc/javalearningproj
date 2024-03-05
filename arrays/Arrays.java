package arrays;

public class Arrays {
    public static void main(String[] args) {
        int [] x = {9,6,5,8,1,3,2};
        for (int i = 0; i < x.length; i++) {
            System.out.print("x["+i+"]  ");
        }
        System.out.println();
        for (int j = 0; j < x.length; j++) {
            System.out.print("  "+ x[j]+"   ");
        }
        System.out.println();
        for (int i = 0; i < x.length; i++) {
            for (int k = i; k < x.length; k++) {
                if (x[i]>x[k]) {
                    int temp = x[i];
                    x[i] = x[k];
                    x[k] = temp;
                }
            }
            System.out.println((i+1) + "th iteration");
            for (int j = 0; j < x.length; j++) {
                System.out.print("  "+ x[j]+"   ");
            }
            System.out.println();
        }
        
    }
    
}

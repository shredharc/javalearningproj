package arrays;

public class Sort {
    public static void main(String[] args) {
        int [] x = {4,2,6,5};
      
        for(  int i = 0; i<x.length; i++){
            for(int j = 0; j<x.length; j++){
                x[i]=x[j];
                System.out.println();
            }
        }
    }

}

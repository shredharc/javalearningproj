package arrays;

public class TwoDimensiona {
    public static void main(String[] args) {
        int Table[][] = {{1,2,3, 3}, {4,5,6,5}, {7,8,9,9}};
        
        for(int i =0; i<Table.length; i++){
            for (int j=0; j<Table[i].length; j++){
                System.out.print(Table[i][j]);
                System.out.print(" ");
            } 
            System.out.println();
        }

        }
}

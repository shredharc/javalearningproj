package Classes;



class Elements {
    int[] num = new int[10];
    int index;
    void add(int n) {
        num[index] = n;
        index ++; 
    }
    void printElements(){
        for(int i = 0; i<index; i++){
            System.out.println(num[i]);
        }
    }
    boolean findElement(int f){
        boolean result = false;
        for(int i = 0; i<index; i++){
            if(num[i] == f){
                return true;
            }else{
                result = false;
            }
        }
         return result;
    }
    void sortElement(){
        for(int i = 0; i<index; i++){
            if ( ) {
                
            }
        }

    }
}

class ElementsTest {
    public static void main(String[] args) {
        Elements e = new Elements();
        e.add(60);
        e.add(20);
        e.add(30);
        e.printElements();
        boolean result = e.findElement(50);
        System.out.println(result);
        result = e.findElement(10);
        System.out.println(result);

    }
}

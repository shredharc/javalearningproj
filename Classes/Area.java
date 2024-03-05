package Classes;

public class Area {
    public static void main(String[] args) {
        AreaOfShape triangle = new AreaOfShape(15, 20, 0, 0);
        triangle.printareaoftriangle();

        AreaOfShape rectangle = new AreaOfShape(30, 0, 20,0);
        rectangle.printareaofrectangle();

        AreaOfShape defaultShape = new AreaOfShape();
        defaultShape.printareaofsquare();
       
    }

}
class AreaOfShape{
    public int breadth;
    private int height;
    int length;
    int side;
    
    AreaOfShape(int b, int h, int l, int s){
        breadth = b;
        height = h;
        length = l;
        side = s;

    }
    AreaOfShape(){
        System.out.println("default constructor");
        breadth = 1;
        height = 1;
        length = 1;
        side = 2;

    }

    public void printareaofsquare() {
        System.out.println(side*side);
    }

    void printareaoftriangle(){
        System.out.println( (float)1/2*breadth*height);

    }

    void printareaofrectangle(){
        System.out.println(length*breadth);
    }

}


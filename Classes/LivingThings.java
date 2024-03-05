package Classes;

public class LivingThings {
    public static void main(String[] args){
        Animals a = new Animals();
        a.name = "dog";
        a.colour = "black";
        a.printAnimaldetails();


        Animals a2 = new Animals();
        a2.name = "cat";
        a2.colour = "white";
        a2.printAnimaldetails();

    }

}

class Animals{
    String name;
    String colour;
      
    void printAnimaldetails(){
        System.out.println(name);
        System.out.println(colour);
    }

}
package Classes;

public class UserDefinedDataType {
    public static void main(String[] args) {
        int i=10;
        Student s = new Student();
        s.mathsMarks = 60;
        s.sciMarks = 70;
        s.socMarks = 80;
        s.printTotalMarks();
        float avg = s.getAverage();
        System.out.println(avg);
        s.printGrade(avg);

        Student s2 = new Student();
        s2.mathsMarks = 80;
        s2.sciMarks = 80;
        s2.socMarks = 80;
        s2.printTotalMarks();
        avg = s2.getAverage();
        System.out.println(avg);

       
    }
}

/**
 * Student
 */
class Student {
    //attributes or properties
   
    int mathsMarks;
    int socMarks;
    int sciMarks;

    void printTotalMarks() {
        System.out.println(mathsMarks+ socMarks+sciMarks);
    }

    float getAverage() {
        return (float) (mathsMarks + socMarks+ socMarks)/3;
    }

    void printGrade(float avg) {
        if (avg >= 60) {
            System.out.println("1st grade");
        } else  if (avg >= 50 && avg<60) {
            System.out.println("2nd grade");
        } else  if (avg < 50) {
            System.out.println("3rd grade");
        }
    }

}


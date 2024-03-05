package Classes;
public class EmployeeApp{
    public static void main(String[] args) {
        Employee ee = new Employee();
        ee.name = "hare Krishna";
        ee.jobTitle = "SE";
        ee.salary = 50000.00f;
        ee.printEmployeeDetails();
        ee.raiseSalary(5.0f);
        ee.printEmployeeDetails();

        Employee ee2 = new Employee();
        ee2.name = "hare rama";
        ee2.jobTitle = "SSE";
        ee2.salary = 90000.00f;
        ee2.printEmployeeDetails();
        ee2.raiseSalary(6.5f);
        ee2.printEmployeeDetails();
    }
}

class Employee{
    String name;
    String jobTitle;
    float salary;
    void Employee() {

    }
    void printEmployeeDetails(){
        System.out.println(name);
        System.out.println(jobTitle);
        System.out.println(salary);
        raiseSalary(5);
    }

    public void raiseSalary(float per){
        salary = salary+salary*per/100;
    }
}
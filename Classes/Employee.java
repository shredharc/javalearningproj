package Classes;

 class Employee22 {
    String employeename;
    String companyname;
    int salary;
    String jobtype;

}
// class employee
class EmployeeDetails{
    public static void main(String[] args) {
        Employee22 e1 = new Employee22();
        e1.employeename = "hare";
        e1.companyname = "wells";
        e1.salary = 30000;
        e1.jobtype = "testing";
        

        Employee22 e2 = new Employee22();
        e2.employeename = "rama";
        e2.companyname = "infosys";
        e2.salary = 50000;
        e2.jobtype = "developer";

        System.out.println("employeename : " +e1.employeename);
        System.out.println("companyname : "+e1.companyname);
        System.out.println("salary : "+e1.salary); 
        System.out.println("jobtype : "+e1.jobtype);

        System.out.println("employeename : " +e2.employeename);
        System.out.println("companyname : "+e2.companyname);
        System.out.println("salary : "+e2.salary); 
        System.out.println("jobtype : "+e2.jobtype);
    }
}
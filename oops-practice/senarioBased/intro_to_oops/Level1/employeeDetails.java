
public class employeeDetails {
    String name;
    int id;
    double salary;


    // Constructor(jab hame obj banate time hi value set jrnu ho or default value set krni ho)
    employeeDetails(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }
    public static void main(String[] args) {
        employeeDetails emp1=new employeeDetails("Ankit",1,50000.0);
        // emp1.name="Ankit";
        // emp1.id=1;
        // emp1.salary=50000.0;
        emp1.displayDetails();
    }
}

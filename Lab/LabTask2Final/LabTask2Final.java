package LabTask2Final;

public class LabTask2Final {
    public static void main(String[] args) {
        Company c = new Company("American International", 3);

        Position dev = new Position("Developer", 50000);
        Position manager = new Position("Manager", 80000);
        Position designer = new Position("Designer", 45000);

        c.addEmployee(new Employee("Neymar", dev));
        c.addEmployee(new Employee("Messi", manager));
        c.addEmployee(new Employee("Ronaldo", designer));

        c.showEmployeeNames();
        System.out.println();

        c.showAllEmployeeDetails();
    }
}

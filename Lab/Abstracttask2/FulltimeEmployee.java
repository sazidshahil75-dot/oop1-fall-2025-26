package Abstracttask2;

class FullTimeEmployee extends AbstractTaskQ1 {
    double monthlySalary;

    public FullTimeEmployee(String name, double monthlySalary) {
        super();
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        String name = null;
        return "Employee name: " + name + "\n"
                + "Monthly Salary: " + monthlySalary;
    }
}


package Abstracttask2;

abstract class Employee {
    String name;

    public Employee(String name) {
        System.out.println("Employee constructor called.");
        this.name = name;
    }

    abstract double calculateSalary();

    @Override
    public abstract String toString();

    public String showDetails() {
        return "Employee Name: " + name;
    }
}

package LabTask2Final;

class Employee {
    private String name;
    private Position position;

    public Employee(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void showEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
    }
}

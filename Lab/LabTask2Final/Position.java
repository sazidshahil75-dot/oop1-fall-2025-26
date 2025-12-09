package LabTask2Final;

class Position {
    private String title;
    private double salary;

    public Position(String title, double salary) {
        this.title = title;
        this.salary = salary;
    }

    public String toString() {
        return title + ", "+salary;
    }
}

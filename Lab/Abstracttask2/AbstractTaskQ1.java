package Abstracttask2;

public class AbstractTaskQ1 {
    public static void main(String[] args) {
        FullTimeEmployee p1 = new FullTimeEmployee("Sazid Hasan", 70000);
        System.out.println(p1.toString());
    }

    public double calculateSalary() {
        throw new UnsupportedOperationException("Unimplemented method 'calculateSalary'");
    }
}

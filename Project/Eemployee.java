public class Eemployee {
    private int baseSalary; 
    private int hourlyRate;

    public static int numberOfEmployees; 

    public Eemployee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Eemployee (int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate > 0) {
            this.hourlyRate = hourlyRate;
        } else {
            throw new IllegalArgumentException("Hourly rate cannot be negative.");
        }
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary >= 0) {
            this.baseSalary = baseSalary;
        } else {
            throw new IllegalArgumentException("Base salary cannot be negative.");
        }
    }

    public int getBaseSalary() {
        return baseSalary;
    }
}

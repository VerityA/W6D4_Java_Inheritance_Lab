public abstract class Employee {
    
    private String name;
    private String NINumber;
    private double salary;
    
    public Employee(String name, String NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double percentageRaise) {
        double factor = 1 + percentageRaise;
        this.salary = salary * factor;
        return salary;
    }

    public double payBonus() {
        double bonus = this.salary * 0.01;
        return bonus;
    }
}

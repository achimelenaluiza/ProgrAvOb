package Company;

public class Employee {

    protected String name;
    protected int age;
    private String hireDate; //"DD/MM/YYYY"
    private double salary;
    private String socialSecurityNumber;
    private double bonus;
    private String reasonForBonus;
    private String boss;

    public Employee() {
        this.name = "-";
        this.age = 0;
        this.hireDate = "-";
        this.salary = 0;
        this.socialSecurityNumber = "-";
        this.bonus = 0;
        this.reasonForBonus = "-";
        this.boss = "-";
    }

    public Employee(String name, int age, String hireDate, double salary, String socialSecurityNumber, String boss) {
        this.name = name;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
        this.socialSecurityNumber = socialSecurityNumber;
        this.boss = boss;
    }

    public void setBonus(double bonus, String reasonForBonus) {
        this.bonus = bonus;
        this.reasonForBonus = reasonForBonus;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
        public String toString() {
            return name +
                    " age " + age +
                    ", hireDate '" + hireDate + '\'' +
                    ", salary " + salary +
                    ", socialSecurityNumber '" + socialSecurityNumber + '\'' +
                    ", bonus " + bonus +
                    ", reasonForBonus '" + reasonForBonus + '\'' +
                    ", boss '" + boss + '\'';
        }
}

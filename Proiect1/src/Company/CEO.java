package Company;

public class CEO extends Employee{

    private double stocksOwned; //"ex: 5.2 %"
    private double personalInvestment; //"ex: 30.000"

    public CEO() {

        super();
        this.stocksOwned = 0;
        this.personalInvestment = 0;
    }

    public CEO(String name, int age, String hireDate, double salary, String socialSecurityNumber, String boss, double stocksOwned, double personalInvestment) {
        super(name, age, hireDate, salary, socialSecurityNumber, boss);
        this.stocksOwned = stocksOwned;
        this.personalInvestment = personalInvestment;
    }

    @Override
    public String toString() {
        return "CEO " + super.toString() +
                ", stocksOwned " + stocksOwned +
                ", personalInvestment " + personalInvestment;
    }
}

package Company;

public class Supplier {

    private String name;
    private String offered;
    private int numMonthsOfContract;
    private double amountPaid;

    public Supplier(String name, String offered, int numMonthsOfContract, double amountPaid) {
        this.name = name;
        this.offered = offered;
        this.numMonthsOfContract = numMonthsOfContract;
        this.amountPaid = amountPaid;
    }

    public Supplier() {
        this.name = "-";
        this.offered = "-";
        this.numMonthsOfContract = 0;
        this.amountPaid = 0;
    }

    @Override
    public String toString() {
        return "Supplier " +
                "name '" + name + '\'' +
                ", offered \'" + offered + '\'' +
                ", for " + numMonthsOfContract +
                " months, amount paid " + amountPaid;
    }
}

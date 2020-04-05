package Company;

public class Building extends Property {

    private String address;
    private double monthlyPay;

    public Building() {
        super();
        this.address = "-";
        this.monthlyPay = 0;
    }

    public Building(String description, String dateOfPurchase, double netWorth, double investment, String address, double monthlyPay) {
        super(description, dateOfPurchase, netWorth, investment);
        this.address = address;
        this.monthlyPay = monthlyPay;
    }

    @Override
    public String toString() {
        return super.toString() +
                "address '" + address + '\'' +
                ", monthlyPay " + monthlyPay + "\n";
    }
}

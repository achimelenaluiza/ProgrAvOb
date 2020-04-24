package Company.Property;

import Company.Company;

public class Property {

    private String description;
    private String dateOfPurchase;
    private double netWorth;
    private double investment;

    public Property(String description, String dateOfPurchase, double netWorth, double investment) {
        this.description = description;
        this.dateOfPurchase = dateOfPurchase;
        this.netWorth = netWorth;
        this.investment = investment;
    }

    public Property() {
        this.description = "-";
        this.dateOfPurchase = "-";
        this.netWorth = 0;
        this.investment = 0;
    }

    @Override
    public String toString() {
        return  "Property: " + description + "\' " +
                "dateOfPurchase '" + dateOfPurchase + "\'" +
                ", netWorth " + netWorth +
                ", investment " + investment + "\n" ;
    }
}

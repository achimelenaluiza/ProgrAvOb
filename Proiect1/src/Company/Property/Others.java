package Company.Property;

import Company.Company;
import Company.Property.Property;

public class Others extends Property {

    private String type;
    private String reasonForPurchase;

    public Others() {
        super();
        this.type = "-";
        this.reasonForPurchase = "-";
    }

    public Others(String description, String dateOfPurchase, double netWorth, double investment, String type, String reasonForPurchase) {
        super(description, dateOfPurchase, netWorth, investment);
        this.type = type;
        this.reasonForPurchase = reasonForPurchase;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type \'" + type +
                "\', reasonForPurchase \'" + reasonForPurchase + "\' \n";
    }
}

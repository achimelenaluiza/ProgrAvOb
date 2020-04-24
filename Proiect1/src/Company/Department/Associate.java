package Company.Department;

import Company.Company;
import Company.Department.Department;

public class Associate extends Department {

    private int numMonthsOfContract;
    private String endDate;
    private String owner;

    public Associate(String title, int numberOfEmployees, int numMonthsOfContract, String owner, String endDate) {
        super(title, numberOfEmployees);
        this.numMonthsOfContract = numMonthsOfContract;
        this.endDate = endDate;
        this.owner = owner;
    }

    public Associate() {
        this.owner = "-";
        this.endDate = "-";
    }

    @Override
    public String toString() {
        return "Associate " +
                "for " + numMonthsOfContract + " months, until " + endDate +
                ", owner " + owner + "\n" + super.toString() ;
    }
}

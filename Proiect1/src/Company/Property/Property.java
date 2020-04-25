package Company.Property;

import Company.AuditService.Table;
import Company.Company;
import Company.Employee.Employee;

import java.io.*;

public class Property extends Table {

    private String description;
    private String dateOfPurchase;
    private double netWorth;
    private double investment;
    private static String fileName = "Property.csv";
    private static FileWriter tableFile = null;
    private static boolean fetchedAll = false;

    public Property(String description, String dateOfPurchase, double netWorth, double investment) {
        this.description = description;
        this.dateOfPurchase = dateOfPurchase;
        this.netWorth = netWorth;
        this.investment = investment;
        saveData(tableFile);
    }

    public Property() {
        this.description = "-";
        this.dateOfPurchase = "-";
        this.netWorth = 0;
        this.investment = 0;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  "Property: " + description + "\' " +
                "dateOfPurchase '" + dateOfPurchase + "\'" +
                ", netWorth " + netWorth +
                ", investment " + investment + "\n" ;
    }

    @Override
    protected String toCsv() {
        return description + "," + dateOfPurchase
                + "," + netWorth + "," + investment;
    }

    public static void enableModify(boolean enable) {
        if (enable) {
            tableFile = enableTable(fileName, true);
        }
        else {
            try {
                tableFile.flush();
                tableFile.close();
                tableFile  =  null;
            } catch (Exception e) {
                // enters here when it shall log but the logging is not enabled
            }
        }
    }

    public static void fetchData() {
        try (BufferedReader csvReader = new BufferedReader(new FileReader(fileName))) {
            String row;
            csvReader.readLine(); // Skip first line
            while ((row = csvReader.readLine()) != null) {
                new Property((row + ",.").split(","));
                System.out.println(row);
            }
            System.out.println("***");
            fetchedAll = true;
        } catch (FileNotFoundException e) {
            System.out.println("No prior data saved for Property");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            enableModify(true);
        }
    }

    public Property(String[] csvData) {
        description = csvData[0];
        dateOfPurchase = csvData[1];
        netWorth = Double.parseDouble(csvData[2]);
        investment = Double.parseDouble(csvData[3]);
    }
}

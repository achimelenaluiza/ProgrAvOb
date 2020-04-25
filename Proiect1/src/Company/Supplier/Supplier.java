package Company.Supplier;

import Company.AuditService.Table;
import Company.Company;
import Company.Employee.Employee;

import java.io.*;

public class Supplier extends Table {

    private String name;
    private String offered;
    private int numMonthsOfContract;
    private double amountPaid;
    private static String fileName = "Supplier.csv";
    private static FileWriter tableFile = null;
    private static boolean fetchedAll = false;

    public Supplier(String name, String offered, int numMonthsOfContract, double amountPaid) {
        this.name = name;
        this.offered = offered;
        this.numMonthsOfContract = numMonthsOfContract;
        this.amountPaid = amountPaid;
        saveData(tableFile);
    }

    public Supplier() {
        this.name = "-";
        this.offered = "-";
    }

    @Override
    public String toString() {
        return "Supplier " +
                "name '" + name + '\'' +
                ", offered \'" + offered + '\'' +
                ", for " + numMonthsOfContract +
                " months, amount paid " + amountPaid;
    }

    @Override
    protected String toCsv() {
        return name + "," + offered + ","
                + numMonthsOfContract + "," + amountPaid;
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
                e.printStackTrace();
            }
        }
    }

    public static void fetchData() {
        try (BufferedReader csvReader = new BufferedReader(new FileReader(fileName))) {
            String row;
            csvReader.readLine(); // Skip first line
            while ((row = csvReader.readLine()) != null) {
                new Supplier((row + ",.").split(","));
                System.out.println(row);
            }
            System.out.println("***");
            fetchedAll = true;
        } catch (FileNotFoundException e) {
            System.out.println("No prior data saved for Supplier");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            enableModify(true);
        }
    }

    public Supplier (String[] csvData) {
        name = csvData[0];
        offered = csvData[1];
        numMonthsOfContract = Integer.parseInt(csvData[2]);
        amountPaid = Double.parseDouble(csvData[3]);
    }
}

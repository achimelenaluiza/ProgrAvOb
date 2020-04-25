package Company.Employee;

import Company.AuditService.Audit;
import Company.AuditService.Table;
import Company.Company;

import java.io.*;

public class Employee extends Table {

    protected String name;
    protected int age;
    private String hireDate; //"DD/MM/YYYY"
    private double salary;
    private String socialSecurityNumber;
    private double bonus;
    private String reasonForBonus;
    private String boss;
    private static String fileName = "Employee.csv";
    private static FileWriter tableFile = null;
    private static boolean fetchedAll = false;

    public Employee() {
        this.name = "-";
        this.hireDate = "-";
        this.socialSecurityNumber = "-";
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
        saveData(tableFile);
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

    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
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

    @Override
    protected String toCsv () {
        return name + "," +age + "," +
                hireDate + "," + salary + "," +
                socialSecurityNumber + "," + bonus + "," +
                reasonForBonus + "," + boss;
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
                new Employee ((row + ",.").split(","));
                System.out.println(row);
            }
            System.out.println("***");
            fetchedAll = true;
        } catch (FileNotFoundException e) {
            System.out.println("No prior data saved for Employees");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            enableModify(true);
        }
    }

    public Employee(String[] csvData) {
        name = csvData[0];
        age = Integer.parseInt(csvData[1]);
        hireDate = csvData[2];
        salary = Double.parseDouble(csvData[3]);
        socialSecurityNumber = csvData[4];
        bonus = Double.parseDouble(csvData[5]);
        reasonForBonus = csvData[6];
        boss = csvData[7];
    }
}

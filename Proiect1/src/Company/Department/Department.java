package Company.Department;

import Company.AuditService.Table;
import Company.Company;
import Company.Employee.Employee;
import Company.AuditService.Audit;

import java.io.*;

public class Department extends Table {

    private String title;
    private int numberOfEmployees;
    private Employee[] employees;
    private static String fileName = "Department.csv";
    private static FileWriter tableFile = null;
    private static boolean fetchedAll = false;

    public Department(String title, int numberOfEmployees) {
        this.title = title;
        this.numberOfEmployees = numberOfEmployees;
        saveData(tableFile);
    }

    public Department() {
        this.title = "-";
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public String EmployeesToString() {
        String aux = new String();
        for (int i = 0; i < this.employees.length; i++) {
            aux = aux + employees[i].toString() + "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        if (this.getNumberOfEmployees() == 0)
            return title + ":\n No employees";
        return title +
                ":\n" + this.EmployeesToString();
    }

    @Override
    protected String toCsv() {
        return title + "," + numberOfEmployees;
    }

    public static void enableModify(boolean enable) {
        if (enable) {
            tableFile = enableTable(fileName, true);
            //false to overwrite the file
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
                new Department ((row + ",.").split(","));
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

    public Department(String[] csvData) {
        title = csvData[0];
        numberOfEmployees = Integer.parseInt(csvData[1]);
    }
}

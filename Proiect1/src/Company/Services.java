package Company;

import java.util.Arrays;
import java.util.Comparator;

public class Services {

    //Sorting array
    public void sortEmployees(Employee[] employees) {
        Arrays.sort(employees, new sortEmployeesBySalary());
    }

    class sortEmployeesBySalary implements Comparator<Employee> {
        public int compare (Employee a, Employee b) {
            return (int)a.getSalary() - (int)b.getSalary();
        }
    }

    //Printing company details
    public String getCompanyDetails(Company company) {
        return company.getCompanyName() + " has " +
                company.getDepartments().length + " departments and " +
                company.getAssociates().length + " associates and " +
                company.getProperties().length + " properties and " +
                company.getSuppliers().length + " suppliers and the CEO is " + company.getCeo().getName();
    }

    //Hire new employee in specific department
    public void createNewEmployee(Company company, String departmentTitle, Employee employee) {
        Department aux = new Department();

        int ok = 0;
        for (int i = 0; i < company.getDepartments().length; i ++)
            if (departmentTitle == company.getDepartments()[i].getTitle()) {
                aux = company.getDepartments()[i];
                ok = 1;
            }
        if (ok == 0)
                throw new RuntimeException("Departamentul nu exista");

        Employee[] auxEmployees = new Employee[aux.getNumberOfEmployees() + 1];

        for (int i = 0; i < aux.getEmployees().length; i ++)
            auxEmployees[i] = aux.getEmployees()[i];
        auxEmployees[aux.getNumberOfEmployees()] = employee;

        aux.setNumberOfEmployees(aux.getNumberOfEmployees() + 1);
        aux.setEmployees(auxEmployees);
    }

    //Delete specific employee from specific department
    public void deleteSpecificEmployee(Company company, String departmentTitle, String employeeName) {
        Department aux = new Department();

        int ok = 0;
        for (int i = 0; i < company.getDepartments().length; i++)
            if (departmentTitle == company.getDepartments()[i].getTitle()) {
                aux = company.getDepartments()[i];
                ok = 1;
            }
        if (ok == 0)
            throw new RuntimeException("Departamentul nu exista");

        Employee[] auxEmployees = new Employee[aux.getNumberOfEmployees() - 1];

        int k = 0;
        ok = 0;
        for (int i = 0; i < aux.getEmployees().length; i++)
            if (aux.getEmployees()[i].getName() != employeeName) {
                auxEmployees[k] = aux.getEmployees()[i];
                k++;
            }
            else ok = 1;
        if (ok == 0)
            throw new RuntimeException("Angajatul nu exista");

        aux.setNumberOfEmployees(aux.getNumberOfEmployees() - 1);
        aux.setEmployees(auxEmployees);
    }

    //Print specific department
    public void printDepartment(Company company, String departmentTitle) {
        int ok = 0;
        for (int i = 0; i < company.getDepartments().length; i++)
            if (departmentTitle == company.getDepartments()[i].getTitle()) {
                System.out.println(company.getDepartments()[i].toString());
                ok = 1;
            }

        if (ok == 0)
            throw new RuntimeException("Departamentul nu exista");
    }
}

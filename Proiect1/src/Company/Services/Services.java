package Company.Services;

import Company.AuditService.Audit;
import Company.Department.Associate;
import Company.Department.Department;
import Company.Employee.Employee;
import Company.*;
import Company.Property.Building;
import Company.Property.Property;
import Company.Supplier.Supplier;

import java.util.Arrays;
import java.util.Comparator;

public class Services {

    //Sorting array
    public void sortEmployees(Employee[] employees) {
        Arrays.sort(employees, new SortEmployeesBySalary());
        Audit.auditData("Sort employees array ");
    }

    class SortEmployeesBySalary implements Comparator<Employee> {
        public int compare (Employee a, Employee b) {
            return (int)a.getSalary() - (int)b.getSalary();
        }
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

        Audit.auditData("Created new employee " + employee.toString());
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

        Audit.auditData("Deleted employee " + employeeName);
    }

    //Delete specific department
    public void deleteSpecificDepartment(Company company, String departmentTitle) {

        int ok = 0;
        for (int i = 0; i < company.getDepartments().length; i++)
            if (departmentTitle == company.getDepartments()[i].getTitle()) {
                ok = 1;
            }
        if (ok == 0)
            throw new RuntimeException("Departamentul nu exista");

        Department[] auxDepartments = new Department[company.getDepartments().length - 1];

        int k = 0;
        for (int i = 0; i < company.getDepartments().length; i++)
            if (company.getDepartments()[i].getTitle() != departmentTitle) {
                auxDepartments[k] = company.getDepartments()[i];
                k++;
            }

        company.setDepartments(auxDepartments);

        Audit.auditData("Deleted department " + departmentTitle);
    }

    //Add new department with no employees
    public void createNewDepartment(Company company, String departmentName) {

        Department department = new Department(departmentName,0);
        Department auxDepartments[] = new Department[company.getDepartments().length + 1];

        for(int i = 0; i < company.getDepartments().length; i ++) {
            auxDepartments[i] = company.getDepartments()[i];
        }
        auxDepartments[company.getDepartments().length] = department;

        company.setDepartments(auxDepartments);

        Audit.auditData("Created new department " + departmentName);
    }

    //Add new associate with no emloyees
    public void createNewAssociate(Company company, Associate associate) {

        Associate auxAssociate[] = new Associate[company.getAssociates().length + 1];
        if(associate.getNumberOfEmployees() != 0)
            throw new RuntimeException("Associate trebuie sa aiba 0 angajati");

        for(int i = 0; i < company.getAssociates().length; i ++) {
            auxAssociate[i] = company.getAssociates()[i];
        }
        auxAssociate[company.getAssociates().length] = associate;
        company.setAssociates(auxAssociate);

        Audit.auditData("Added new associate " + associate.getTitle());
    }

    //Hire new associate employee in specific associate department
    public void createNewAssociateEmployee(Company company, String departmentTitle, Employee employee) {
        Associate aux = new Associate();

        int ok = 0;
        for (int i = 0; i < company.getAssociates().length; i ++)
            if (departmentTitle == company.getAssociates()[i].getTitle()) {
                aux = company.getAssociates()[i];
                ok = 1;
            }
        if (ok == 0)
            throw new RuntimeException("Departamentul asociat nu exista");

        Employee[] auxEmployees = new Employee[aux.getNumberOfEmployees() + 1];

        for (int i = 0; i < aux.getNumberOfEmployees(); i ++)
            auxEmployees[i] = aux.getEmployees()[i];
        auxEmployees[aux.getNumberOfEmployees()] = employee;

        aux.setNumberOfEmployees(aux.getNumberOfEmployees() + 1);
        aux.setEmployees(auxEmployees);

        Audit.auditData("Created new employee in associate department " + employee.toString());
    }

    //Delete specific employee from specific associate department
    public void deleteSpecificEmployeeFromAssociate(Company company, String departmentTitle, String employeeName) {
        Associate aux = new Associate();

        int ok = 0;
        for (int i = 0; i < company.getAssociates().length; i++)
            if (departmentTitle == company.getAssociates()[i].getTitle()) {
                aux = company.getAssociates()[i];
                ok = 1;
            }
        if (ok == 0)
            throw new RuntimeException("Departamentul asociat nu exista");

        Employee[] auxEmployees = new Employee[aux.getNumberOfEmployees() - 1];

        int k = 0;
        ok = 0;
        if (aux.getNumberOfEmployees() == 0)
            throw new RuntimeException("Angajatul nu exista");
        for (int i = 0; i < aux.getNumberOfEmployees(); i++)
            if (aux.getEmployees()[i].getName() != employeeName) {
                if(k >= aux.getNumberOfEmployees() - 1)
                    throw new RuntimeException("Angajatul nu exista");
                auxEmployees[k] = aux.getEmployees()[i];
                k++;
            }
            else ok = 1;
        if (ok == 0)
            throw new RuntimeException("Angajatul nu exista");

        aux.setNumberOfEmployees(aux.getNumberOfEmployees() - 1);
        aux.setEmployees(auxEmployees);

        Audit.auditData("Deleted employee from Associate " + employeeName);
    }

    //Add new Property : car
    public void addProperty(Company company, Property property) {
        Property[] auxProperty = new Property[company.getProperties().length + 1];

        for(int i = 0; i < company.getProperties().length; i ++)
            auxProperty[i] = company.getProperties()[i];
        auxProperty[company.getProperties().length] = property;
        company.setProperties(auxProperty);

        Audit.auditData("Bought new property " + property.getDescription());
    }

    //Delete specific property
    public void deleteProperty(Company company, Property property) {

        Property[] auxProperty = new Property[company.getProperties().length - 1];
        int k = 0;
        for (int i = 0; i < company.getProperties().length; i++)
            if (company.getProperties()[i] != property) {
                auxProperty[k] = company.getProperties()[i];
                k ++;
            }
        company.setProperties(auxProperty);

        Audit.auditData("Deleted property " + property.getDescription());
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

    public static void open() {
        Employee.fetchData();
        Department.fetchData();
        Property.fetchData();
        Supplier.fetchData();
    }

    public static void close() {
        Employee.enableModify(false);
        Department.enableModify(false);
        Property.enableModify(false);
        Supplier.enableModify(false);
    }
}

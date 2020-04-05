package Company;

import java.util.Arrays;

public class Department {

    private String title;
    private int numberOfEmployees;
    private Employee[] employees;

    public Department(String title, int numberOfEmployees) {
        this.title = title;
        this.numberOfEmployees = numberOfEmployees;
    }

    public Department() {
        this.title = "-";
        this.numberOfEmployees = 0;
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

    public String EmployeesToString(){
        String aux = new String();
        for (int i = 0; i < this.employees.length; i ++)
        {
            aux = aux + employees[i].toString() + "\n";
        }
        return aux;
    }

    @Override
    public String toString() {
        return title +
                ":\n" + this.EmployeesToString();
    }
}

package Company;

import Company.AuditService.Audit;
import Company.Department.Associate;
import Company.Department.Department;
import Company.Employee.Employee;
import Company.Property.Property;
import Company.Supplier.Supplier;

public class Company {

    private String companyName;
    private Employee ceo;
    private Department[] departments;
    private Associate[] associates;
    private Property[] properties;
    private Supplier[] suppliers;

    public Company() {
        this.companyName = "-";
        this.ceo = new Employee();
    }

    public Company(String companyName, Employee ceo) {
        this.companyName = companyName;
        this.ceo = ceo;
    }

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void setCeo(Employee ceo) { this.ceo = ceo; }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }

    public void setAssociates(Associate[] associates) {
        this.associates = associates;
    }

    public void setProperties(Property[] properties) {
        this.properties = properties;
    }

    public void setSuppliers(Supplier[] suppliers) {
        this.suppliers = suppliers;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Associate[] getAssociates() {
        return associates;
    }

    public Property[] getProperties() {
        return properties;
    }

    public Supplier[] getSuppliers() {
        return suppliers;
    }

    public Employee getCeo() {
        return ceo;
    }

    public String DepartmentsToString(){
        String aux = new String();
        for (int i = 0; i < this.departments.length; i ++)
        {
            aux = aux + " --> " + departments[i].toString();
        }
        return aux;
    }

    public String PropertiesToString(){
        String aux = new String();
        for (int i = 0; i < this.properties.length; i ++)
        {
            aux = aux + " --> " + properties[i].toString();
        }
        return aux;
    }

    public String associatesToString(){
        String aux = new String();
        for (int i = 0; i < this.associates.length; i ++)
        {
            aux = aux + " --> " + associates[i].toString();
        }
        return aux;
    }

    public String suppliersToString(){
        String aux = new String();
        for (int i = 0; i < this.suppliers.length; i ++)
        {
            aux = aux + " --> " + suppliers[i].toString();
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Company " + companyName.toUpperCase() +
                "\n " + ceo.toString() + "\n" +
                "\ndepartments :\n" + this.DepartmentsToString() +
                "\nassociates :\n" + this.associatesToString() +
                "\nproperties :\n" + this.PropertiesToString() +
                "\nsuppliers :\n" + this.suppliersToString();
    }

    //Printing company details
    public String getCompanyDetails() {
        return this.getCompanyName() + " has " +
                this.getDepartments().length + " departments and " +
                this.getAssociates().length + " associates and " +
                this.getProperties().length + " properties and " +
                this.getNumberOfEmployees() + " employees and " +
                this.getSuppliers().length + " suppliers and the CEO is " + this.getCeo().getName();
    }

    //Printing number of employees
    public int getNumberOfEmployees() {
        int nr = 1;
        for (int i = 0; i < this.getDepartments().length; i++)
            nr += this.getDepartments()[i].getNumberOfEmployees();
        for (int i = 0; i < this.getAssociates().length; i++)
            nr += this.getAssociates()[i].getNumberOfEmployees();
        return nr;
    }
}

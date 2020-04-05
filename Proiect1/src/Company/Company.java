package Company;

import java.util.Arrays;

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

    public String AssociatesToString(){
        String aux = new String();
        for (int i = 0; i < this.associates.length; i ++)
        {
            aux = aux + " --> " + associates[i].toString();
        }
        return aux;
    }

    public String SuppliersToString(){
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
                "\n " + ceo + "\n" +
                "\ndepartments :\n" + this.DepartmentsToString() +
                "\nassociates :\n" + this.AssociatesToString() +
                "\nproperties :\n" + this.PropertiesToString() +
                "\nsuppliers :\n" + this.SuppliersToString();
    }
}

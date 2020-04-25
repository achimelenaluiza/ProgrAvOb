package Company;

import Company.Department.Associate;
import Company.Employee.Employee;
import Company.Property.Others;
import Company.Property.Property;
import Company.Services.Services;
import Company.Services.EntityService;

public class DefineCompany {

    public static void main(String[] args) {

        Services services = new Services();
        services.open();

        Company company = new Company("THEcompany");

        EntityService entityService = new EntityService();
        entityService.loadCompany(company);

        System.out.println("\nINITIAL COMPANY \n -----------------\n");
        System.out.println(company.toString());



        System.out.println("\nExample of sorting an Employee array based on salary:\n-------------------");
        services.sortEmployees(company.getDepartments()[0].getEmployees());
        System.out.println(company.getDepartments()[0].toString());

        System.out.println("\nExample of adding a new employee in a specific department:\n-------------------");
        Employee pr5 = new Employee("Mircescu Vasile", 27, "01/04/2020", 2800,"193021290067","Coriiu Razvan");
        services.createNewEmployee(company,"Production", pr5);
        services.printDepartment(company,"Production");

        System.out.println("\nExample of deleting a specific employee from a specific department:\n-------------------");
        services.deleteSpecificEmployee(company,"Production", "Manole Adina");
        services.printDepartment(company,"Production");

        System.out.println("\nExample of deleting a specific department:\n-------------------");
        services.deleteSpecificDepartment(company,"Marketing");
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of creating a new specific department with no employees:\n-------------------");
        services.createNewDepartment(company, "Marketing");
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of adding a new property:\n-------------------");
        Property property1 = new Others("Audi 2014 blue", "14/04/2020", 10500, 12000, "car", "transportation + publicity");
        services.addProperty(company,property1);
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of deleting some property:\n-------------------");
        services.deleteProperty(company,property1);
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of creating new associate with no employees:\n-------------------");
        Associate associate1 = new Associate("Cleaning", 0, 24, "Clear SRL", "01/12/2021");
        services.createNewAssociate(company, associate1);
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of creating new associate employe in associate department:\n-------------------");
        Employee assoc3 = new Employee("Mala Rosalinda", 54, "01/01/2019", 1800, "2551117190039", "-");
        services.createNewAssociateEmployee(company,"Cleaning", assoc3);
        System.out.println(company.getCompanyDetails());

        System.out.println("\nExample of deleting specific associate employe from associate department:\n-------------------");
        services.deleteSpecificEmployeeFromAssociate(company,"Transport", "Gavril Ionut");
        System.out.println(company.getCompanyDetails());

        System.out.println("\n----------------\nCOMPANY AFTER CHANGES \n----------------");
        System.out.println(company.toString());
        System.out.println(company.getCompanyDetails());

        services.close();
    }

}

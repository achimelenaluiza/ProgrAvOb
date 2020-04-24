package Company;

import Company.Employee.Employee;
import Company.Services.Services;
import Company.Services.EntityService;

public class DefineCompany {

    public static void main(String[] args) {


        Company company = new Company("THEcompany");

        EntityService entityService = new EntityService();
        entityService.loadCompany(company);

        System.out.println("\nINITIAL COMPANY \n -----------------\n");
        System.out.println(company.toString());

        Services services = new Services();

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

        //System.out.println("\n----------------\nCOMPANY AFTER CHANGES \n----------------");
        //System.out.println(company.toString());
    }

}

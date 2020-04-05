package Company;

public class DefineCompany {

    public static void main(String[] args) {

        //CEO
        Employee ceo = new CEO("Chivu Alexandru", 42, "01/01/2011",11230, "1780415340017 ", "-",4.5,250000);

        //DEPARTMENTS
        Department dep1 = new Department("Marketing", 2);
        Department dep2 = new Department("HumanResources", 2);
        Department dep3 = new Department("Production", 4);
        Department dep4 = new Department("Legal", 1);

        Department[] departments = {dep1, dep2, dep3, dep4};

        //EMPLOYEES
        Employee mark1 = new Employee("Popescu Maria", 28, "01/04/2012",3500, "29210618320033", "Chivu Alexandru");
        mark1.setBonus(200, "head of department");
        Employee mark2 = new Employee("Marinescu Ioana", 26, "01/04/2017",2700, "2940618320033", "Popescu Maria");
        dep1.setEmployees(new Employee[] {mark1, mark2});

        Employee hr1 = new Employee("Georgescu Mircea", 33, "15/07/2015", 3200, "1870613510091", "Chivu Alexandru");
        hr1.setBonus(200,"head of department");
        Employee hr2 = new Employee("Milea Ana",37,"15/02/2019",2500,"2830513410058","Georgescu Mircea");
        dep2.setEmployees(new Employee[] {hr1, hr2});

        Employee pr1 = new Employee("Gancea Ariana", 27, "01/04/2018", 3200, "2930905440034", "Coriiu Razvan");
        pr1.setBonus(150,"special project");
        Employee pr2 = new Employee("Coriiu Razvan", 54, "12/09/2014",4150, "1660114340029", "Chivu Alexandru");
        pr2.setBonus(200,"head of department");
        Employee pr3 = new Employee("Manole Adina", 29, "15/10/2017",3900,"2910621330094","Coriiu Razvan");
        Employee pr4 = new Employee("Balasoiu Eduard", 25, "15/04/2016", 3300,"1960928340066", "Coriiu Razvan");
        dep3.setEmployees(new Employee[]{pr1,pr2,pr3,pr4});

        Employee legal1 = new Employee("Marin Violeta", 40, "01/12/2013", 4000,"2800105370078","Chivu Alexandru");
        legal1.setBonus(300,"winning rate > 85%");
        dep4.setEmployees(new Employee[]{legal1});

        //ASSOCIATES
        Associate associate1 = new Associate("Transport", 2, 24, "Amic SRL", "01/12/2021");
        Employee assoc1 = new Employee("Tanase Marius", 50, "01/01/2019", 2800, "1551117190039", "-");
        assoc1.setBonus(1000,"nightshift + head of department");
        Employee assoc2 = new Employee("Gavril Ionut", 46, "01/01/2019", 2800, "1640430180090", "Tanase Marius");

        associate1.setEmployees(new Employee[]{assoc1, assoc2});

        //PROPERTIES
        Property property1 = new Others("BMW 2014 red", "25/11/2019", 10500, 12000, "car", "transportation + publicity");
        Property property2 = new Building("First floor of office building", "16/07/2017", 240000, 223156, "445 Mount Eden Road", 25000);

        //SUPPLIERS
        Supplier supplier1 = new Supplier("Bookster", "books for employees", 36, 8000);

        //COMPANY
        Company company = new Company("THEcompany", ceo);
        company.setDepartments(departments);
        company.setAssociates(new Associate[]{associate1});
        company.setProperties(new Property[]{property1,property2});
        company.setSuppliers(new Supplier[]{supplier1});

        System.out.println("\nINITIAL COMPANY \n -----------------\n");
        System.out.println(company.toString());

        Services services = new Services();

        System.out.println("\nExample of sorting an Employee array based on salary:\n-------------------");
        services.sortEmployees(company.getDepartments()[0].getEmployees());
        System.out.println(company.getDepartments()[0].toString());

        System.out.println("\nExample of printing company details:\n-------------------");
        System.out.println(services.getCompanyDetails(company));

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

package opgave3.application.service;

import java.util.ArrayList;

import opgave3.application.model.Company;
import opgave3.application.model.Employee;
import opgave3.storage.Storage;

public class Service {

    private static Service service;

    public static Service getService() {
        if (service == null) {
            service = new Service();
        }
        return service;
    }
    /**
     * Creates a new Company.<br />
     * Requires: hours >= 0.
     */
    public  Company createCompany(String name, int hours) {
        Company company = new Company(name, hours);
        Storage.getStorage().addCompany(company);
        return company;
    }

    /**
     * Deletes the company.<br />
     * Requires: The company has no employees.
     */
    public void deleteCompany(Company company) {
        Storage.getStorage().removeCompany(company);
    }

    /**
     * Updates the company.<br />
     * Requires: hours >= 0.
     */
    public void updateCompany(Company company, String name, int hours) {
        company.setName(name);
        company.setHours(hours);
    }

    /**
     * Get all the companies
     */
    public ArrayList<Company> getCompanies() {
        return Storage.getStorage().getCompanies();
    }

    // -------------------------------------------------------------------------

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0.
     */
    public  Employee createEmployee(String name, int wage) {
        Employee employee = new Employee(name, wage);
        Storage.getStorage().addEmployee(employee);
        return employee;
    }

    /**
     * Creates a new employee.<br />
     * Requires: wage >= 0, company!=null.
     */
    public Employee createEmployee(String name, int wage, Company company) {
        Employee employee = new Employee(name, wage);
        company.addEmployee(employee);
        employee.setCompany(company);
        Storage.getStorage().addEmployee(employee);
        return employee;
    }


    /**
     * Deletes the employee.
     */
    public void deleteEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
            employee.clearCompany();
        }
        Storage.getStorage().removeEmployee(employee);
    }

    /**
     * Updates the employee.<br />
     * Requires: wage >= 0.
     */
    public void updateEmployee(Employee employee, String name, int wage) {
        employee.setName(name);
        employee.setWage(wage);
    }

    /**
     * Get all the employees.
     */
    public ArrayList<Employee> getEmployees() {
        return Storage.getStorage().getEmployees();
    }

    // -------------------------------------------------------------------------

    /**
     * Updates the employee's company.
     */
    public void updateCompanyOfEmployee(Employee employee, Company company) {
        Company current = employee.getCompany();
        if (current != null) {
            current.removeEmployee(employee);
            employee.clearCompany();
        }
        employee.setCompany(company);
        company.addEmployee(employee);
    }

    /**
     * Clears the company of the employee.
     */
    public void clearCompanyOfEmployee(Employee employee) {
        Company company = employee.getCompany();
        if (company != null) {
            company.removeEmployee(employee);
            employee.clearCompany();
        }
    }

    // -------------------------------------------------------------------------

    /**
     * Initializes the storage with some objects.
     */
    public void initStorage() {
        Company c1 = Service.getService().createCompany("IBM", 37);
        Company c2 = Service.getService().createCompany("AMD", 40);
        Service.getService().createCompany("SLED", 45);
        Service.getService().createCompany("Vector", 32);

        Service.getService().createEmployee("Bob Dole", 210, c2);
        Service.getService().createEmployee("Alice Schmidt", 250, c1);
        Service.getService().createEmployee("George Down", 150, c2);
        Service.getService().createEmployee("Rita Uphill", 300);
    }

}

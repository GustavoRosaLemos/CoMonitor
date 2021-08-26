package Model;

import java.util.ArrayList;

public class Subsidiary extends Company {
    private String displayName;
    private ArrayList<Employee> employees;
    private String employeesList = "";

    public Subsidiary(String companyName, String fantasyName, String cnpj, String displayName) {
        super(companyName, fantasyName, cnpj);
        this.displayName = displayName;
        this.employees = new ArrayList<Employee>();
    }

    public Subsidiary(String companyName, String fantasyName, String cnpj, String displayName, ArrayList<Employee> employees) {
        super(companyName, fantasyName, cnpj);
        this.displayName = displayName;
        this.employees = employees;
    }

    public Subsidiary(String companyName, String fantasyName, String cnpj, String displayName, ArrayList<Employee> employees, String employeesList) {
        super(companyName, fantasyName, cnpj);
        this.displayName = displayName;
        this.employees = employees;
        this.employeesList = employeesList;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean setDisplayName(String displayName) {
        if(displayName instanceof  String) {
            this.displayName = displayName;
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public String getEmployeesList() {
        return employeesList;
    }

    @Override
    public String toString() {
        return "SubsidiaryModel{" +
                ", displayName='" + displayName + '\'' +
                ", employees=" + employees +
                '}';
    }
}

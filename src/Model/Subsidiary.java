package Model;

import java.util.ArrayList;

public class Subsidiary extends Company {
    private int id;
    private String displayName;
    private ArrayList<Employee> employees;
    private String employeesList = "";

    public Subsidiary(String companyName, String fantasyName, String cnpj, int id1, String displayName) {
        super(companyName, fantasyName, cnpj);
        this.id = id1;
        this.displayName = displayName;
        this.employees = new ArrayList<Employee>();
    }

    public Subsidiary(String companyName, String fantasyName, String cnpj, int id1, String displayName, ArrayList<Employee> employees) {
        super(companyName, fantasyName, cnpj);
        this.id = id1;
        this.displayName = displayName;
        this.employees = employees;
    }

    public Subsidiary(String companyName, String fantasyName, String cnpj, int id1, String displayName, ArrayList<Employee> employees, String employeesList) {
        super(companyName, fantasyName, cnpj);
        this.id = id1;
        this.displayName = displayName;
        this.employees = employees;
        this.employeesList = employeesList;
    }

    public int getId() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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
                "id=" + id +
                ", displayName='" + displayName + '\'' +
                ", employees=" + employees +
                '}';
    }
}

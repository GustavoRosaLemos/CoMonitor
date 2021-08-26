package Model;

import java.util.ArrayList;

public class Subsidiary extends Company {
    private String displayName;
    private ArrayList<Employee> employees;

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

    public String getDisplayName() {
        return displayName;
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

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Subsidiary{" +
                "displayName='" + displayName + '\'' +
                ", employees=" + employees +
                '}';
    }

    public void print() {
        System.out.println(displayName);
        for (Employee employee:employees) {
            System.out.println("Nome Completo: " + employee.getFullName() + ", Cargo: " + employee.getRole() + ", Regime de Trabalho: " + employee.getWorkMethod() + ", Emails: " + employee.getEmails() + ", Telefones: " + employee.getPhones());
        }
    }
}

package Model;

import java.util.ArrayList;

public class Subsidiary extends Company {
    private int id;
    private String displayName;
    private ArrayList<Employee> employees;

    public Subsidiary(int id, String companyName, String fantasyName, String cnpj, int id1, String displayName) {
        super(id, companyName, fantasyName, cnpj);
        this.id = id1;
        this.displayName = displayName;
        this.employees = new ArrayList<Employee>();
    }

    public Subsidiary(int id, String companyName, String fantasyName, String cnpj, int id1, String displayName, ArrayList<Employee> employees) {
        super(id, companyName, fantasyName, cnpj);
        this.id = id1;
        this.displayName = displayName;
        this.employees = employees;
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

    private void addEmployee(Employee employee) {
        employees.add(employee);
    }

    private void removeEmployee(Employee employee) {
        employees.remove(employee);
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

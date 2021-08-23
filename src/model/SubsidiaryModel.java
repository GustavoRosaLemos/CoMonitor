package model;

import java.util.ArrayList;

public class SubsidiaryModel {
    private int id;
    private String displayName;
    private ArrayList<EmployeeModel> employees;

    public SubsidiaryModel(int id, String displayName) {
        this.id = id;
        this.displayName = displayName;
        this.employees = new ArrayList<EmployeeModel>();
    }

    public SubsidiaryModel(int id, String displayName, ArrayList<EmployeeModel> employees) {
        this.id = id;
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

    public ArrayList<EmployeeModel> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<EmployeeModel> employees) {
        this.employees = employees;
    }

    private void addEmployee(EmployeeModel employee) {
        employees.add(employee);
    }

    private void removeEmployee(EmployeeModel employee) {
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

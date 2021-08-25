package Model;

import java.util.ArrayList;

public class Employee {
    private int id;
    private String fullName;
    private String role;
    private String location;
    private boolean infected = false;
    private boolean immunized = false;
    private String workMethod = "Presencial";
    private ArrayList<Email> emails;
    private ArrayList<Phone> phones;

    public Employee(int id, String fullName, String role, String location) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.location = location;
    }

    public Employee(int id, String fullName, String role, String location, boolean infected, boolean immunized) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
    }

    public Employee(int id, String fullName, String role, String location, String workMethod) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.workMethod = workMethod;
    }

    public Employee(int id, String fullName, String role, String location, boolean infected, boolean immunized, String workMethod) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
        this.workMethod = workMethod;
    }

    public Employee(int id, String fullName, String role, String location, boolean infected, boolean immunized, String workMethod, ArrayList<Email> emails, ArrayList<Phone> phones) {
        this.id = id;
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
        this.workMethod = workMethod;
        this.emails = emails;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isInfected() {
        return infected;
    }

    public void setInfected(boolean infected) {
        this.infected = infected;
    }

    public boolean isImmunized() {
        return immunized;
    }

    public void setImmunized(boolean immunized) {
        this.immunized = immunized;
    }

    public String getWorkMethod() {
        return workMethod;
    }

    public boolean setWorkMethod(String workMethod) {
        if(workMethod.equalsIgnoreCase("presencial")) {
            this.workMethod = "Presencial";
            return true;
        } else if(workMethod.equalsIgnoreCase("hibrido")) {
            this.workMethod = "Hibrido";
            return true;
        } else if(workMethod.equalsIgnoreCase("homeoffice")) {
            this.workMethod = "HomeOffice";
            return true;
        }
        return false;
    }

    public ArrayList<Email> getEmails() {
        return emails;
    }

    public void setEmails(ArrayList<Email> emails) {
        this.emails = emails;
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public void removeEmail(Email email) {
        emails.remove(email);
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void removePhone(Phone phone) {
        phones.remove(phone);
    }

    @Override
    public String toString() {
        return "EmployeeModel{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", infected=" + infected +
                ", immunized=" + immunized +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }
}

package Model;

import java.util.ArrayList;

public class Employee {
    private String fullName;
    private String role;
    private String location;
    private boolean infected = false;
    private boolean immunized = false;
    private String workMethod = "Presencial";
    private ArrayList<Email> emails;
    private ArrayList<Phone> phones;

    public Employee(String fullName, String role, String location) {
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.emails = new ArrayList<>();
        this.phones = new ArrayList<>();
    }

    public Employee(String fullName, String role, String location, boolean infected, boolean immunized) {
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
        this.emails = new ArrayList<>();
        this.phones = new ArrayList<>();
    }

    public Employee(String fullName, String role, String location, String workMethod) {
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.workMethod = workMethod;
        this.emails = new ArrayList<>();
        this.phones = new ArrayList<>();
    }

    public Employee(String fullName, String role, String location, boolean infected, boolean immunized, String workMethod) {
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
        this.workMethod = workMethod;
        this.emails = new ArrayList<>();
        this.phones = new ArrayList<>();
    }

    public Employee(String fullName, String role, String location, boolean infected, boolean immunized, String workMethod, ArrayList<Email> emails, ArrayList<Phone> phones) {
        this.fullName = fullName;
        this.role = role;
        this.location = location;
        this.infected = infected;
        this.immunized = immunized;
        this.workMethod = workMethod;
        this.emails = emails;
        this.phones = phones;
    }


    public String getFullName() {
        return fullName;
    }

    public String getRole() {
        return role;
    }

    public String getLocation() {
        return location;
    }

    public boolean isInfected() {
        return infected;
    }

    public boolean isImmunized() {
        return immunized;
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


    public void addEmail(Email email) {
        emails.add(email);
    }

    public void removeEmail(Email email) {
        emails.remove(email);
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void removePhone(Phone phone) {
        phones.remove(phone);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", role='" + role + '\'' +
                ", location='" + location + '\'' +
                ", infected=" + infected +
                ", immunized=" + immunized +
                ", workMethod='" + workMethod + '\'' +
                ", emails=" + emails +
                ", phones=" + phones +
                '}';
    }
}

package Model;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private String password;
    private int employeeId;
    private boolean isAdmin = false;


    public User(int id, String username, String password, int employeeId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
    }


    public User(int id, String username, String password, int employeeId, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.employeeId = employeeId;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }
}

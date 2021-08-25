package Model;

import java.util.ArrayList;

public class User {
    private int id;
    private String username;
    private boolean isAdmin = false;
    private ArrayList<String> permissions;

    public User(int id, String username) {
        this.id = id;
        this.username = username;
    }

    public User(int id, String username, boolean isAdmin) {
        this.id = id;
        this.username = username;
        this.isAdmin = isAdmin;
    }

    public User(int id, String username, boolean isAdmin, ArrayList<String> permissions) {
        this.id = id;
        this.username = username;
        this.isAdmin = isAdmin;
        this.permissions = permissions;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public ArrayList<String> getPermissions() {
        return permissions;
    }
}

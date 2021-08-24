package model;

public class EmailModel {
    private int id;
    private String type;
    private String value;

    public EmailModel(int id, String type, String value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }
}

package Model;

public class Phone {
    private int id;
    private String type;
    private String ddd;
    private String number;

    public Phone(int id, String type, String ddd, String number) {
        this.id = id;
        this.type = type;
        this.ddd = ddd;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getDdd() {
        return ddd;
    }

    public String getNumber() {
        return number;
    }
}

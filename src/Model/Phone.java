package Model;

public class Phone {
    private String type;
    private String ddd;
    private String number;

    public Phone(String type, String ddd, String number) {
        this.type = type;
        this.ddd = ddd;
        this.number = number;
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

    @Override
    public String toString() {
        return "Phone{" +
                ", type='" + type + '\'' +
                ", ddd='" + ddd + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}

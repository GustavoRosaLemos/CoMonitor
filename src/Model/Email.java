package Model;

public class Email {
    private String type;
    private String value;

    public Email(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Email{" +
                "type='" + type + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}

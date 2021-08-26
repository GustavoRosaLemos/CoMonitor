import Controller.Database;
import CustomException.CustomException;

public class Main {
    public static void main(String[] args) throws CustomException {
        Database.connect();
        View.Alerts.execute();
        System.out.println("Sistema iniciado!");
    }
}

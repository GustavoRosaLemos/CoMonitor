import Controller.Database;
import CustomException.CustomException;

public class Main {
    public static void main(String[] args) throws CustomException {
        Database.connect();
        System.out.println("Sistema iniciado!");
    }
}

import Controller.Database;
import CustomException.CustomException;
import Model.Employee;
import Model.Subsidiary;
import Controller.Interface;

public class Main {
    public static void main(String[] args) throws CustomException {
        Database.connect();
        System.out.println("Sistema iniciado!");
    }
}

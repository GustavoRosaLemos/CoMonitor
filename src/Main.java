import Controller.Database;
import CustomException.CustomException;
import Model.Employee;
import Model.Subsidiary;
import Controller.Interface;

public class Main {
    public static void main(String[] args) throws CustomException {
        Database.connect();
        Subsidiary subsidiary = new Subsidiary(1, "Serasa LTDA", "Serasa Consumidor", "2039324", 1, "Serasa Blumenau");
        subsidiary.addEmployee(new Employee(1, "Carlos José", "Gerente de TI", "Andar 5"));
        subsidiary.addEmployee(new Employee(2, "Roberto Antonio", "Desenvolvedor", "Andar 5", true, false));
        System.out.println(Interface.getRiskLevel(subsidiary));
        System.out.println("Sistema iniciado!");
    }
}

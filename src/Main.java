import Controller.Mail;
import View.Login;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciado!");
        Login.execute();
        System.out.println(Mail.Send("Testando o envio de email", "Oi eu sou o seu email java ;)", "paulodalescio@gmail.com"));
    }
}

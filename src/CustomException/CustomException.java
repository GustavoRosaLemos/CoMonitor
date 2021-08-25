package CustomException;

public class CustomException extends Exception {
    private final String mensagem;

    public CustomException(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return mensagem;
    }
}

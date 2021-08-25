package Controller;

import CustomException.CustomException;

import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    private static Connection connectMySQL = null;
    private static Connection connectDatabase = null;
    private static Connection connectDatabaseExtra = null;
    private static String urlMySQL = "jdbc:mysql://localhost:3306";
    private static String urlDataBase = "jdbc:mysql://localhost:3306/comonitor";
    private static String user = "root";
    private static String password = "";

    public static Connection connect() throws CustomException{
        if (connectDatabase == null){
            newConnectionDatabase();
        } else {
            try{
                if (connectDatabase.isClosed()){
                    newConnectionDatabase();
                }
            } catch(Exception error){
                throw new CustomException("Erro ao verificar se a conexão ao banco está fechada: " + error.getMessage());
            }
        }
        return connectDatabase;
    }

    private static void newConnectionMySQL() throws CustomException{
        try {
            connectMySQL = DriverManager.getConnection(urlMySQL,user,password);
        }catch (Exception error){
            throw new CustomException("Erro ao solicitar uma nova conexão ao MySQL: " + error.getMessage());
        }
    }

    private static void newConnectionDatabase() throws CustomException{
        try {
            connectDatabase = DriverManager.getConnection(urlDataBase,user,password);
        }catch (Exception error){
            throw new CustomException("Erro ao solicitar uma nova conexão ao banco de dados: " + error.getMessage());
        }
    }

    public static void closeConnectionMySQL() throws CustomException{
        try{
            connectMySQL.close();
        } catch(Exception error){
            throw new CustomException("Erro ao fechar a conexão ao MySQL: " + error.getMessage());
        }
    }

    public static void closeConnectionDatabase() throws CustomException{
        try{
            connectDatabase.close();
        } catch(Exception error){
            throw new CustomException("Erro ao fechar a conexão ao MySQL: " + error.getMessage());
        }
    }
}

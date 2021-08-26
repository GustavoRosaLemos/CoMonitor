package Model;

import CustomException.CustomException;
import Controller.Database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class UserDAO {
    public static User getUser(String username) throws CustomException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        User user = new User(0, "", "", 0);
        try {
            String sql = "SELECT * FROM users WHERE username = ?";
            pstmt = Database.connect().prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.execute();
            rs = pstmt.getResultSet();
            if(rs.next()){
                user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), rs.getInt("employeeId"), rs.getBoolean("isAdmin"));
            }
        } catch (Exception error) {
            throw new CustomException("Erro ao buscar no banco de dados: " + error.getMessage());
        } finally{
            try{
                if (pstmt != null){
                    pstmt.close();
                }
                if (rs != null){
                    rs.close();
                }
            } catch (Exception error){}
            Database.closeConnectionDatabase();
        }
        return user;
    }
}

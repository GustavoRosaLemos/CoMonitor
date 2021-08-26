package Model;

import Controller.Database;
import CustomException.CustomException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmployeeDao {
    public static Employee getEmployee(int employeeId) throws CustomException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Employee employee = new Employee(0, "", "", "", "");
        try {
            String sql = "SELECT * FROM employees WHERE id = ?";
            pstmt = Database.connect().prepareStatement(sql);
            pstmt.setInt(1, employeeId);
            pstmt.execute();
            rs = pstmt.getResultSet();
            if(rs.next()){
                employee = new Employee(rs.getInt("id"), rs.getString("fullname"), rs.getString("role"), rs.getString("location"), rs.getBoolean("infected"), rs.getBoolean("immunized"));
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
        return employee;
    }
}

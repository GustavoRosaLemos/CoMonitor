package Model;

import Controller.Database;
import CustomException.CustomException;

import java.sql.Array;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public abstract class SubsidiaryDao {
    public static ArrayList<Subsidiary> getSubsidiaries(int employeeId) throws CustomException {
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        ArrayList<Subsidiary> subsidiaries = new ArrayList<>();
        try {
            String sql = "SELECT * FROM enterprises WHERE employeesList LIKE ?";
            pstmt = Database.connect().prepareStatement(sql);
            pstmt.setInt(1, employeeId);
            pstmt.execute();
            rs = pstmt.getResultSet();
            if(rs.next()) {
                subsidiaries.add(new Subsidiary(rs.getString("companyName"), rs.getString("fantasyName"), rs.getString("cnpj"), rs.getInt("id"), rs.getString("displayName")));
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

        for (Subsidiary subsidiary: subsidiaries) {
           //TODO
        }
        return subsidiaries;
    }
}

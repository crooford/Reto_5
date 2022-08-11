/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Util.JDBCUtilities;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class LiderDAO {
    public List<LiderDTO> Listar() throws SQLException {
    ArrayList<LiderDTO> respuesta = new ArrayList<>();
        Connection con= JDBCUtilities.getConnection();
        Statement stm= null;
        ResultSet rs= null;
        String consulta ="SELECT ID_Lider , Nombre , Primer_Apellido , Ciudad_Residencia " +
                         "FROM Lider l " +
                         "ORDER BY Ciudad_Residencia ";
        try {
                stm = con.createStatement();
                rs= stm.executeQuery(consulta);
                while (rs.next()) {
                        LiderDTO object = new LiderDTO();
                        object.setId(rs.getInt("ID_Lider"));
                        object.setName(rs.getString("Nombre"));
                        object.setFirstLastName(rs.getString("Primer_Apellido"));
                        object.setCity(rs.getString("Ciudad_Residencia"));
                        respuesta.add(object);
                    }
            }
        finally{
                if (rs != null){
                    rs.close();
                }
                if (stm != null) {
                    stm.close();
                }
                if (con != null){
                    con.close();
                }      
            }
        return respuesta;
        

    }
}

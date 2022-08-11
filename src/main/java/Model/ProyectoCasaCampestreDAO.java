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
public class ProyectoCasaCampestreDAO {
    public List<ProyectoCasaCampestreDTO> Listar() throws SQLException {
    ArrayList<ProyectoCasaCampestreDTO> respuesta = new ArrayList<>();
        Connection con= JDBCUtilities.getConnection();
        Statement stm= null;
        ResultSet rs= null;
        String consulta ="SELECT  ID_Proyecto , Constructora , Numero_Habitaciones , Ciudad " +
                         "FROM Proyecto p " +
                         "WHERE Clasificacion='Casa Campestre' " +
                         "AND Ciudad IN ('Santa Marta','Cartagena','Barranquilla') " +
                         "ORDER BY Ciudad ";
        try {
                stm = con.createStatement();
                rs= stm.executeQuery(consulta);
                while (rs.next()) {
                        ProyectoCasaCampestreDTO object = new ProyectoCasaCampestreDTO();
                        object.setId(rs.getInt("ID_Proyecto"));
                        object.setConstructora(rs.getString("Constructora"));
                        object.setNumbersRooms(rs.getInt("Numero_Habitaciones"));
                        object.setCity(rs.getString("Ciudad"));
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

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
public class ComprasSalentoDAO {
    public List<ComprasSalentoDTO> Listar() throws SQLException {
        List<ComprasSalentoDTO> respuesta = new ArrayList<ComprasSalentoDTO>();
        Connection con= JDBCUtilities.getConnection();
        Statement stm= null;
        ResultSet rs= null;
        String consulta ="SELECT c.ID_Compra , Constructora , Banco_Vinculado " +
                         "FROM Proyecto p " +
                         "JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto " +
                         "WHERE c.Proveedor='Homecenter' " +
                         "AND p.Ciudad='Salento' " +
                         "ORDER BY Constructora ";
        try {
                stm = con.createStatement();
                rs= stm.executeQuery(consulta);
                while (rs.next()) {
                        ComprasSalentoDTO object = new ComprasSalentoDTO();
                        object.setId(rs.getInt("ID_Compra"));
                        object.setConstructora(rs.getString("Constructora"));
                        object.setBanco(rs.getString("Banco_Vinculado"));
                        respuesta.add(object);
                        // System.out.println("prueba "+object.toString());
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


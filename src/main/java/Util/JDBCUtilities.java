/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Usuario
 */
public class JDBCUtilities {
    private static final String UBICACION_BD = "ProyectosConstruccion.db";
    public static Connection getConnection() throws SQLException {
    String url = "jdbc:sqlite:" + UBICACION_BD;
    return DriverManager.getConnection(url);
    }
    
}
/*
SELECT ID_Lider , Nombre , Primer_Apellido , Ciudad_Residencia  	
FROM Lider l 
ORDER BY Ciudad_Residencia ;

SELECT  ID_Proyecto , Constructora , Numero_Habitaciones , Ciudad  
FROM Proyecto p 
WHERE Clasificacion=('Casa Campestre')
AND Ciudad IN ('Santa Marta','Cartagena','Barranquilla')
ORDER BY Ciudad;

SELECT c.ID_Compra , Constructora , Banco_Vinculado 
FROM Proyecto p 
JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto 
WHERE c.Proveedor='Homecenter'
AND p.Ciudad='Salento'
ORDER BY Constructora;
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.util.List;
import Model.*;

/**
 *
 * @author Usuario
 */
public class InformeController {
    private  ComprasSalentoDAO comprassalentodao;
    private  ProyectoCasaCampestreDAO proyectocasacampestredao;
    private  LiderDAO liderdao;
    
    public InformeController() {
        comprassalentodao = new ComprasSalentoDAO();
        proyectocasacampestredao = new ProyectoCasaCampestreDAO();
        liderdao = new LiderDAO();
    }
    
    public List<ComprasSalentoDTO> ListatotalcomprasSalento() throws SQLException{
        return comprassalentodao.Listar();
    } 
    public List<ProyectoCasaCampestreDTO> Listatotalproyectocasacampestre() throws SQLException{
        return proyectocasacampestredao.Listar();
    }
    public List<LiderDTO> Listaliderciudad() throws SQLException{
        return liderdao.Listar();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import java.util.List;
import java.sql.SQLException;
import Controller.InformeController;
import Model.ComprasSalentoDTO;
import Model.LiderDTO;
import Model.ProyectoCasaCampestreDTO;

/**
 *
 * @author Usuario
 */
public class InformesView {
    private static InformeController controller;
    
    public InformesView() {
        controller = new InformeController();
    }
    
    private String repitaCaracter(Character caracter, Integer veces) {
        String respuesta = "";
        for (int i = 0; i < veces; i++) {
        respuesta += caracter;
        }
        return respuesta;
    }
    public void Lider() {
       
        System.out.println(repitaCaracter('-', 41));
        try {
            
            List<LiderDTO> project3 = controller.Listaliderciudad();
            
            for (LiderDTO vo : project3) {
                System.out.println(vo);
            }
        }catch(SQLException ex){
            System.err.println("ERROR: "+ex);
        }
    }
    public void ComprasSalento() {
       
        System.out.println(repitaCaracter('-', 41));
        try {
            
            List<ComprasSalentoDTO> project3 = controller.ListatotalcomprasSalento();
            
            for (ComprasSalentoDTO vo : project3) {
                System.out.println(vo);
            }
        }catch(SQLException ex){
            System.err.println("ERROR: "+ex);
        }
    }
    public void Proyectocasacampestre() {
       
        System.out.println(repitaCaracter('-', 41));
        try {
            
            List<ProyectoCasaCampestreDTO> project3 = controller.Listatotalproyectocasacampestre();
            
            for (ProyectoCasaCampestreDTO vo : project3) {
                System.out.println(vo);
            }
        }catch(SQLException ex){
            System.err.println("ERROR: "+ex);
        }
    }
}

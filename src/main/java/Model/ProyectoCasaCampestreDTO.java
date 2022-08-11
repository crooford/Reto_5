/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class ProyectoCasaCampestreDTO {
    private  Integer id;
    private  String constructora;
    private  Integer numbers_rooms;
    private  String city;
    
    public Integer getId(){
    return id;
    }
    public void setId(Integer id){
    this.id =id;
    }
    
    public String getConstructora(){
    return constructora;
    }
    public void setConstructora(String constructora){
        this.constructora =constructora;
    }
    
    public Integer getNumbersRooms(){
    return numbers_rooms;
    }
    public void setNumbersRooms(Integer numbers_rooms){
        this.numbers_rooms = numbers_rooms;
    }
    
    public String getCity(){
    return city;
    }
    public void setCity(String city){
        this.city =city;
    }
    @Override
    public String toString() {
        return String.format("%4d %-25s %4d %-20s",id ,constructora,numbers_rooms,city );

    }
}

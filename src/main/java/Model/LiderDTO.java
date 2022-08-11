/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Usuario
 */
public class LiderDTO {
    private  Integer id;
    private  String name;
    private  String first_lastname;
    private  String city;
    
    
    public Integer getId(){
    return id;
    }
    public void setId(Integer id){
    this.id =id;
    }
    
    public String getName(){
    return name;
    }
    public void setName(String name){
    this.name =name;
    }
    
    public String getFirstLastName(){
    return first_lastname;
    }
    public void setFirstLastName(String first_lastname){
    this.first_lastname =first_lastname;
    }
    
    public String getCity(){
    return city;
    }
    public void setCity(String city){
    this.city =city;
    }
    @Override
    public String toString() {
        return String.format("%4d %-25s %-25s %-20s",id,name,first_lastname,city);

    }
}

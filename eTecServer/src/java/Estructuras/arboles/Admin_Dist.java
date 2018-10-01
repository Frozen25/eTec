/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.arboles;

/**
 *
 * @author Alexis
 */
public class Admin_Dist {
    private String name;
    private String pass;
    private int codigo;
    
    public Admin_Dist(String nombre, int codigo){
        this.name = nombre;
        this.pass = nombre;
        this.codigo = codigo;
    }
    
    public Admin_Dist(String nombre, int codigo, String clave){
        this.name = nombre;
        this.codigo = codigo;
        this.pass = clave;
    }
    
    public String getName(){
        return name;
    }
    public void setCodigo(int newC){
        this.codigo = newC;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setPass(String newClave){
        this.pass = newClave;
    }
    public String getPass(){
        return pass;
    }
    
    public String getInfo(){
        return name+">"+Integer.toString(codigo);
    }
    
}

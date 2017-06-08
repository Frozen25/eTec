/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

/**
 *
 * @author Alexis
 */
public class Cliente {

    private boolean Active;
    private String email;
    private String centro_distribucion;
    private String nombre;
    private double money;
    
    public Cliente(String nombre, String email, String centro){
        this.nombre = nombre;
        this.email = email;
        this.Active = false;
        this.money = 0;
        this.centro_distribucion = centro;
    }
    
    public Cliente(String nombre, String email, boolean active, double money, String centro){
        this.nombre = nombre;
        this.email = email;
        this.Active = active;
        this.money = money;
        this.centro_distribucion = centro;
    }
    
    public String getName(){
        return nombre;
    }

    public Boolean isActive()
    {
        return Active;
    }

    public void setActive(boolean newActive)
    {
        Active = newActive;
    }

    public String getEmail()
    {
        return email;
    }

    public void changeEmail(String newEmail)
    {
        email = newEmail;
    }

    public void addMoney(double monto)
    {
        this.money += monto;
    }

    public double getMoney(){
        return money;
    }

    public String getCentro(){
        return centro_distribucion;
    }

    public void setCentro(String nuevoc){
        centro_distribucion = nuevoc;
    }

    public String getInfo()
    {
        return nombre + ">" + email + ">" + Active+ ">" + Float.toString((float) money)
                +">"+ centro_distribucion;
    }


    
}

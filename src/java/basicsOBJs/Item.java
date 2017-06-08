/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

/**
 *
 * @author Gabriel
 */
public class Item {
    private String Nombre,imagen;
    private double Precio;
    private int stock;
    private boolean inStock;
    
    public boolean inStock(){return stock>0;}
}

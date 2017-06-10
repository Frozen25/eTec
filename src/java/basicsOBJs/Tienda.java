/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

import Estructuras.DoubleLinkedList;

/**
 *
 * @author Bryan
 */
public class Tienda {
    
    private DoubleLinkedList productos;
    private Item produc;
    private String nombre;
    private int numero;
    
    public Tienda(String nombre, DoubleLinkedList productos, Item produc)
    {
        this.nombre = nombre;
        this.produc = produc;
        this.productos = productos;
    }
    public Tienda(String nombre, DoubleLinkedList productos, Item produc, int numero)
    {
        this.nombre = nombre;
        this.produc = produc;
        this.productos = productos;
        this.numero = numero;
    }
    
    public void anadir(Item produc)
    {
        productos.addLast(produc);
    }
    public void setNumero(int   newnum )
    {
        numero = newnum;
    }
    public int getNumero(){
        return numero;
    }
    
    
    
}

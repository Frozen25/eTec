/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

import Estructuras.DoubleLinkedList;
import Estructuras.ItemsDoubleLinkedList;

/**
 *
 * @author Bryan
 */
public class Tienda {
    
    private ItemsDoubleLinkedList productos = new ItemsDoubleLinkedList();
    private String nombre;
    private int numero;
    
    public Tienda(String nombre, int numero )
    {
        this.nombre = nombre;
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
    public ItemsDoubleLinkedList getLista(){
        return productos;
    }
    
    
    
}

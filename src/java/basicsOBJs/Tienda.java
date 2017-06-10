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
    
    public Tienda(String nombre, DoubleLinkedList productos, Item produc)
    {
        this.nombre = nombre;
        this.produc = produc;
        this.productos = productos;
    }
    
    public void anadir(Item produc)
    {
        productos.addLast(produc);
    }
    
    
    
}

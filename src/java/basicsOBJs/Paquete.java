/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

import Estructuras.DoubleLinkedList;

/**
 *
 * @author Alexis
 */
public class Paquete {
    int codigo;
    int lugar;
    DoubleLinkedList items;
    boolean entregado = false;
    
    public Paquete(int codigo, int lugar){
        this.codigo = codigo;
        this.lugar = lugar;
    }
    public void addPaquete(Item nuevoitem){
        items.addLast(nuevoitem);
    }
    public void setLocation(int newlocation){
        lugar = newlocation;
    }
    public int getLocation(){
        return lugar;
    }
    public boolean getState(){
        return entregado;
    }
    public void Entregado(){
        entregado = true;
    }
    
    
    
}

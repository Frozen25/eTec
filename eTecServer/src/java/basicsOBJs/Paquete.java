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
    private int codigo;
    private int lugar;
    private DoubleLinkedList items;
    private boolean entregado = false;
    private int destino;
    
    public Paquete(int codigo, int lugar){
        this.codigo = codigo;
        this.lugar = lugar;
    }
    public Paquete(int codigo, int lugar, int destino){
        this.codigo = codigo;
        this.lugar = lugar;
        this.destino = destino;
    }
    public int getCode(){
        return codigo;
    }
    public void addPaquete(Item nuevoitem){
        items.addLast(nuevoitem.getNombre());
    }
    public void addPaquete(String nuevoitem){
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
    public void setEstado(boolean newestado){
        entregado = newestado;
    }
    public DoubleLinkedList getlist(){
        return items;
    }
    public void setDestino(int newD){
        destino = newD;
    }
    public int getDestino(){
        return destino;
    }
    
    
}

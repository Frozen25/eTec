/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

import Estructuras.Grafo_Rutas;

/**
 *
 * @author Bryan
 */
public class Gasolinera {
    
    private String nombre;
    private int codigo;
    private int tiempoParada;
    
    public Gasolinera(int tiempoParada)
    {
        codigo= Grafo_Rutas.matriz.length;
        Grafo_Rutas.addNodo();
        Grafo_Rutas.addLista(2);
    }
    
    public Gasolinera(String nombre, int tiempoParada)
    {
        this.nombre = nombre;
        this.tiempoParada = tiempoParada;
    }
    public int getCodigo(){
        return codigo;
    }
    public int getTime(){
        return tiempoParada;
    }
 }

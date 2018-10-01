/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.DoubleLinkedList;
import Estructuras.Grafo_Rutas;
import Estructuras.Node;
import basicsOBJs.CentroDistribucion;
import basicsOBJs.Tienda;

/**
 *
 * @author Alexis
 */
public class testServices {
    public static void main(String[] args) {
    
        
        String crearCentro = crearCentro();
        System.out.println(crearCentro);
        String crearCentro2 = crearCentro();
        System.out.println(crearCentro2);
        String creart= crearTienda(1);
        System.out.println(creart);
        String vector = getVector();
        System.out.println(vector);
        
    }
    
    
    public static String crearCentro() {
        try{
            CentroDistribucion newCentro = new CentroDistribucion();
            
            return "Success, code = " + newCentro.getCode();
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed crearCentro";
        }
    }
    
    public static String crearTienda(int num) {
        try{
            
            Tienda newCentro = new Tienda();
            
            return "Success, code = " + newCentro.getNumero();
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed crearTienda";
        }
    }
    public static String getVector() {
        try{
            DoubleLinkedList<Integer> datos = Grafo_Rutas.datos;
            String stack = "";
            Node current = datos.getHead();
            while(current != null){
                stack += current.getData()+" > ";
                current = current.getNext();
            }
            
            return "Success, vector = " + stack;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getVector";
        }
    }
    
    
}

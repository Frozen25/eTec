/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.DoubleLinkedList;
import Estructuras.Grafo_Rutas;
import Estructuras.Node;
import Estructuras.arboles.AdminBST;
import Estructuras.arboles.Admin_Dist;
import basicsOBJs.CentroDistribucion;
import basicsOBJs.Gasolinera;
import basicsOBJs.Tienda;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexis
 */
@WebService(serviceName = "Administradores")
public class Administradores {

    /**
     * This is a sample web service operation
     * @param nombre
     * @param codigo
     * @param pass
     */
   @WebMethod(operationName = "addAdmin")
    public String add( String nombre, int codigo, String pass) {
        try{
            AdminBST newC = AdminBST.load_Adm();
            Admin_Dist id = new Admin_Dist(nombre, codigo, pass);
            newC.insert(id);
            String x;
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed addAdmin";
        }
    }
    @WebMethod(operationName = "agregarAdmin")
    public String agregarAdmin( String name, int code, String pass) {
        try{
            AdminBST newC = AdminBST.load_Adm();
            Admin_Dist id = new Admin_Dist(name, code, pass);
            newC.insert(id);
            newC.save_Adm();
            String x;
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed agregarAdmin";
        }
    }
    

    

    
    @WebMethod(operationName = "elminarNodo")
    public String elminarNodo(int num) {
        try{
            
            Grafo_Rutas.delete(num);
            
            return "Success Delete" ;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed elminarNodo";
        }
    }
    
    @WebMethod(operationName = "modificarMatriz")
    public String modificarMatriz(int i, int j , int val) {
        try{
            
            Grafo_Rutas.modificar(i, j, val);
            
            return "Success matriz["+i+"]["+j+"]="+val;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed modificarMatriz";
        }
    }
    
    @WebMethod(operationName = "crearTienda")
    public String crearTienda(int num) {
        try{
            
            Tienda newCentro = new Tienda();
            
            return "Success, code = " + newCentro.getNumero();
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed crearTienda";
        }
    }
    
    @WebMethod(operationName = "crearGasolinera")
    public String crearGasolinera() {
        try{
            Gasolinera newCentro = new Gasolinera();
            
            return "Success, code = " + newCentro.getCodigo();
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed crearGasolinera";
        }
    }
    
    @WebMethod(operationName = "crearCentro")
    public String crearCentro() {
        try{
            CentroDistribucion newCentro = new CentroDistribucion();
            
            return "Success, code = " + newCentro.getCode();
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed crearCentro";
        }
    }
    @WebMethod(operationName = "getVector")
    public String getVector() {
        try{
            DoubleLinkedList<Integer> datos = Grafo_Rutas.datos;
            String stack = "";
            Node current = datos.getHead();
            while(current != null){
                stack += current.getData()+" > ";
            }
            
            return "Success, vector = " + stack;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getVector";
        }
    }
    
    @WebMethod(operationName = "getMatriz")
    public String getMatriz() {
        try{
            int[][] matriz = Grafo_Rutas.matriz;
            String stack = "";

            
 
        for(int[] i : matriz){
            stack+="<h1>";
            for(int b : i){
                stack+= (b + "\t");
            }
            stack+="</h1>";
            
        }
        
    
            
            return "<h1>"+"Success, vector = "+"</h1>" + stack;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getMatriz";
        }
    }
    
    
    
    
    
}

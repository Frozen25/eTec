/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.DoubleLinkedList;
import Estructuras.Node;
import basicsOBJs.Tienda;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexis
 */
@WebService(serviceName = "Busqueda_Tiendas")
public class Busqueda_Tiendas {

    /**
     * This is a sample web service operation
     */
        
    @WebMethod(operationName = "operation")
    public String operation() {
        //TODO write your implementation code here:
        return null;
    }
    
    
        /*
    
    @WebMethod(operationName = "busquedaB")
    public DoubleLinkedList busquedaB(int codigo){
        DoubleLinkedList lista_tiendas = new DoubleLinkedList(); 
        //lista_tiendas =  = loadtiendas();
        Node tiendaCurrent = lista_tiendas.getHead();

        DoubleLinkedList tiendas_resultantes = new DoubleLinkedList(); 
        
        
        while(tiendaCurrent!=null){
            DoubleLinkedList productos_current;
            
            productos_current = tiendaCurrent.getProducts();
            productos_current ordenar por code
            
            if (( busquedaBinaria (productos_current, codigo ))!= -1)
            {
                tiendas_resultantes.addFirst(tiendaCurrent);
            }
            tiendaCurrent = tiendaCurrent.getNext();
        }
        Tienda first =(Tienda)( tiendas_resultantes.getHead().getData());
        first.getItem(codigo);
        return tiendas_resultantes;
        
        
    }
    
    @WebMethod(operationName = "busquedaI")
    public DoubleLinkedList busquedaI(int codigo){
        DoubleLinkedList lista_tiendas = new DoubleLinkedList(); 
        //lista_tiendas =  = loadtiendas();
        Node tiendaCurrent = lista_tiendas.getHead();
        
        DoubleLinkedList tiendas_resultantes = new DoubleLinkedList(); 
        
        
        while(tiendaCurrent!=null){
            DoubleLinkedList productos_current;
            
            productos_current = tiendaCurrent.getProducts();
            productos_current ordenar por code
            
                    
                    
            if (( busquedaInterpolada (productos_current, codigo ))!= -1)
            {
                tiendas_resultantes.addFirst(tiendaCurrent);
            }
            tiendaCurrent = tiendaCurrent.getNext();
        }
        Tienda first =(Tienda)( tiendas_resultantes.getHead().getData());
        first.getItem(codigo);
        return tiendas_resultantes;
        
        
    }
    */

 
}

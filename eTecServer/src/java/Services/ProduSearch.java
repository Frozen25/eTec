/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.ItemsDoubleLinkedList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gabriel
 */
@WebService(serviceName = "ProduSearch")
public class ProduSearch {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "coincidenciasNombre")
    public String[] coincidenciasNombre( String txt,String AlgOrden) {
        try{
        
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
        ItemsDoubleLinkedList.ListaGeneral = listaProducto;
        String lis =ItemsDoubleLinkedList.busquedaNombres(txt);
        String[] items =ItemsDoubleLinkedList.listaray(lis);
        ItemsDoubleLinkedList.SortA(AlgOrden, items);
        //listaProducto.saveItem();
        return items;
         }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
     @WebMethod(operationName = "coincidenciasCodigo")
    public String[] coincidenciasCodigo( int id,String AlgOrden) {
        try{
        
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
        ItemsDoubleLinkedList.ListaGeneral = listaProducto;
        String lis =ItemsDoubleLinkedList.busquedaCodigo(id);
        String[] items =ItemsDoubleLinkedList.listaray(lis);
        ItemsDoubleLinkedList.SortA(AlgOrden, items);
        //listaProducto.saveItem();
        return items;
         }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

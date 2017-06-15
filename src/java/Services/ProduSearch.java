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
    @WebMethod(operationName = "hello")
    public String[] busquedas_coincidendcias( String txt,String AlgOrden) {
        try{
        
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
        String lis =ItemsDoubleLinkedList.listString();
        String[] items =ItemsDoubleLinkedList.listaray(lis);
        ItemsDoubleLinkedList.SortA(txt, items);
        listaProducto.saveItem();
        return items;
         }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

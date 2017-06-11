/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.DoubleLinkedList;
import basicsOBJs.Item;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Gabriel
 */
@WebService(serviceName = "Productos")
public class Productos {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "add_item")
    public String add( String nombre,String imagen,double Precio, int stock) 
    {
         try{
        Item it= new Item(nombre,imagen,Precio,stock);
        DoubleLinkedList<Item> listaProducto= new DoubleLinkedList<> ();
        listaProducto.addLast(it);
        return "Success ADD item";
         }catch (Exception e) {
            e.printStackTrace();
            return "Failed addItem";
        }
         
    }
}

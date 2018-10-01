/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Algoritmos.Search.Binary_Search;
import Estructuras.DoubleLinkedList;
import Estructuras.ItemsDoubleLinkedList;
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
        Item it= new Item(nombre,(int)Precio,stock);
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
        listaProducto.addLast(it);
        listaProducto.saveItem();
        return "Success ADD item";
         }catch (Exception e) {
            e.printStackTrace();
            return "Failed addItem";
        }
         
    }
    
     @WebMethod(operationName = "remove_item")
    public String remove(String nombre) 
    {
         try{
        
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
        ItemsDoubleLinkedList.Sort(" Quick", listaProducto);
        int del = ItemsDoubleLinkedList.Search("binaria", nombre, listaProducto);
        listaProducto.deleteAt(del);
        listaProducto.saveItem();
        return "Success remove item";
         }catch (Exception e) {
            e.printStackTrace();
            return "Failed addItem";
        }
         
    }
    
    @WebMethod(operationName = "search_item")
    public String search(String nombre,String algo) 
    {
         try{
        
        ItemsDoubleLinkedList listaProducto =  ItemsDoubleLinkedList.loadItems();
       int sear = ItemsDoubleLinkedList.Search("binaria", nombre, listaProducto);
       if(sear >0){       Item ite=listaProducto.getAt(sear).getData();
        listaProducto.saveItem();
        return ite.toString() ;}else{return "Failed searching Item";}
         
         
         }catch (Exception e) {
            e.printStackTrace();
            return "Failed searching Item";
        }
         
    }
}

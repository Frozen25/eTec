/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.arboles.Cliente;
import Estructuras.arboles.ClientesBST;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
//import javax.ws.rs.Path;

/**
 *
 * @author Alexis
 */
//@Path("/Client")
@WebService(serviceName = "Clientes")
public class Clientes {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "addClient")
    public String add( String nombre, String email, String centro) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            Cliente id = new Cliente(nombre, email, centro);
            newC.insert(id);
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed addClient";
        }
    }
    
    @WebMethod(operationName = "removeClient")
    public String remove( String nombre) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            newC.delete(nombre);
            newC.save();
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed removeCliente";
        }
    }
    
    @WebMethod(operationName = "getEmail")
    public String getEmail( String nombre) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            String email = newC.getClient(nombre).getEmail();
            return email;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getEmail";
        }
    }
    
    @WebMethod(operationName = "setEmail")
    public String setEmail( String nombre, String email) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            newC.getClient(nombre).changeEmail(email);
            newC.save();
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed setEmail";
        }
    }
    
    
    
    @WebMethod(operationName = "getMoney")
    public String getMoney( String nombre) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            double money = newC.getClient(nombre).getMoney();
            return Double.toString(money);
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getMoney";
        }
    }
    
    @WebMethod(operationName = "addMoney")
    public String addMoney( String nombre, double added) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            newC.getClient(nombre).addMoney(added);
            newC.save();
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed addMoney";
        }
    }
    
    @WebMethod(operationName = "getActive")
    public String getActive( String nombre) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            Boolean ac = newC.getClient(nombre).isActive();
            return Boolean.toString(ac);
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getActive";
        }
    }
    
    @WebMethod(operationName = "setActive")
    public String setActive( String nombre, boolean act) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            newC.getClient(nombre).setActive(act);
            newC.save();
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed setActive";
        }
    }
    
    @WebMethod(operationName = "getCentro")
    public String getCentro( String nombre) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            String cen = newC.getClient(nombre).getCentro();
            return cen;
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed getCentro";
        }
    }
    
    @WebMethod(operationName = "setCentro")
    public String setActive( String nombre, String newCentro) {
        try{
            ClientesBST newC = ClientesBST.loadClientBST();
            newC.getClient(nombre).setCentro(newCentro);
            newC.save();
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed setCentro";
        }
    }
    
}

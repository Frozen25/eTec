/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.arboles.AdminBST;
import Estructuras.arboles.Admin_Dist;
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
     */
   @WebMethod(operationName = "addAdmin")
    public String add( String nombre, int codigo) {
        try{
            AdminBST newC = AdminBST.load_Adm();
            Admin_Dist id = new Admin_Dist(nombre, codigo);
            newC.insert(id);
            return "Success";
        }catch (Exception e) {
            e.printStackTrace();
            return "Failed addAdmin";
        }
    }
    
    
    
    
}

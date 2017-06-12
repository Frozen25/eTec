/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Estructuras.arboles.PaquetesBST;
import basicsOBJs.Paquete;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alexis
 */
@WebService(serviceName = "Paquetes")
public class Paquetes {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "getPaquete")
    public int getPaquete(int codigo) {
        PaquetesBST packs = PaquetesBST.loadPaquetes();
        Paquete pack = packs.getMember(codigo);
        if (pack.getState()){
            return -1;
        }
        else{
            return pack.getLocation();
        }
    }
}

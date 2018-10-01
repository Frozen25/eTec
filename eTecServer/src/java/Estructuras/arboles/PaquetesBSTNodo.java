/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.arboles;

import Estructuras.*;
import basicsOBJs.Paquete;

/**
 *
 * @author Alexis
 */
public class PaquetesBSTNodo {

    private Paquete data;
    public PaquetesBSTNodo left;
    public PaquetesBSTNodo right;	
    
    public PaquetesBSTNodo(Paquete data){
        this.data = data;
        left = null;
        right = null;
    }

    
    public Paquete getData()
    {
        return data;
    }
}
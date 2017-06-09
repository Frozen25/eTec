/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Estructuras.*;

/**
 *
 * @author Alexis
 */
public class AdminNodo {

    private Admin_Dist data;
    public AdminNodo left;
    public AdminNodo right;	
    
    public AdminNodo(Admin_Dist data){
        this.data = data;
        left = null;
        right = null;
    }

    public Admin_Dist getData()
    {
        return data;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras.arboles;

/**
 *
 * @author Alexis
 */
public class Pruebas_arboles {
    public static void main (String[] args)
    
    {
    //Clientes    
    ClientesBST clientes = ClientesBST.loadClientBST();
    clientes.displayPre();
    clientes.getClient("Bryan").addMoney(132.455);
    clientes.getClient("Bryan").changeEmail("correnuevo@nv");
    clientes.getClient("Bryan").setActive(true);
    clientes.save();
//Admins
    AdminBST ad = AdminBST.load_Adm();
    ad.getMember("pedro").setCodigo(4);
    ad.save_Adm();
    
    }
}
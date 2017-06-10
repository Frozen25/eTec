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
        
        
        
        /*
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
    */
    AdminBST ad = new AdminBST();
    Admin_Dist a1 = new Admin_Dist("brayan", -1, "1234");
    ad.insert(a1);
    Admin_Dist a2 = new Admin_Dist("emmanuelle", 4, "ac34");
    ad.insert(a2);
    Admin_Dist a3 = new Admin_Dist("elbrayan", -1, "41c2");
    ad.insert(a3);
    ad.save_Adm();
        
        
    }
}
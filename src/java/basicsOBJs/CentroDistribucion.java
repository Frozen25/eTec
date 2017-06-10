/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsOBJs;

/**
 *
 * @author Bryan
 */
public class CentroDistribucion 
{
    private String nombre;
    private int codigo;
    
    public CentroDistribucion(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getName(){
        return nombre;
    }
    
    public void entregado(Item produc)
    {
       produc.entregado();
    }

}

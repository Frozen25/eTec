package basicsOBJs;
 

 
/**
 
 *
 
 * @author Bryan
 
 */
 
public class CentroDistribucion 
 
{
 
    private String nombre;
 
    
 
    public CentroDistribucion(String nombre){
 
        this.nombre = nombre;
 
    }
 
    
 
    public String getName(){
 
        return nombre;
 
    }
 
    
 
    public void entregado(Item produc)
 
    {
 
       produc.entregado();
 
    }
 

 
}
 
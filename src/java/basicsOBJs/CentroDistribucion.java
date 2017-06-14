package basicsOBJs;
 
import Estructuras.arboles.PaquetesBST;


 
/**
 
 *
 
 * @author Bryan
 
 */
 
public class CentroDistribucion {

    private int codigo;
 
    public CentroDistribucion(int codigo){
        this.codigo = codigo;
    }
    
 
    public void entregado(int paquete){
        PaquetesBST packs = PaquetesBST.loadPaquetes();
        packs.getMember(paquete).setEstado(true);
    }
 

 
}
 
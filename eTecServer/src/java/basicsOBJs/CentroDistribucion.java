package basicsOBJs;
 
import Estructuras.Grafo_Rutas;
import Estructuras.arboles.PaquetesBST;


 
/**
 
 *
 
 * @author Bryan
 
 */
 
public class CentroDistribucion {

    private int codigo;
 
    public CentroDistribucion(){
        codigo = Grafo_Rutas.matriz.length;
        Grafo_Rutas.addNodo();
        Grafo_Rutas.addLista(3);
    }
    
    public CentroDistribucion(int codigo){
        this.codigo = codigo;
    }
    
    public void entregado(int paquete){
        PaquetesBST packs = PaquetesBST.loadPaquetes();
        packs.getMember(paquete).setEstado(true);
    }
    public int getCode(){
        return codigo;
    }

 
}
 
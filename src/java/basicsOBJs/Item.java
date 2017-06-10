package basicsOBJs;

public class Item {
 
    private String nombre,imagen;
    private double Precio;
    private int stock;
    private boolean inStock;
 
    
 
    public boolean inStock(){return stock>0;}
    private boolean entregado;
 
      
 
     public Item(String nombre, String imagen, double Precio, int stock, boolean entregado, boolean inStock)
     {
        this.nombre = nombre;
        this.imagen = imagen;
        this.stock = stock;
        this.entregado = false;
        this.inStock = false;
    }
 
     
 
     public void entregado()
     {
         entregado = true;
 
     }

   
}
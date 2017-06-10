package basicsOBJs;

public class Item {
 
    private String nombre,imagen;
    private double Precio;
    private int stock;
    private boolean inStock;
    private boolean entregado;
    
 
    public boolean inStock(){return stock>0;}
    
 
      
 
     public Item(String nombre, String imagen, double Precio, int stock, boolean entregado, boolean inStock)
     {
        this.nombre = nombre;
        this.imagen = imagen;
        this.stock = stock;
        this.inStock = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
 
     
 
     public void entregado()
     {
         entregado = true;
 
     }

   
}
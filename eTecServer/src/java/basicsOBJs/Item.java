package basicsOBJs;

public class Item {
 
    private String nombre;
    private double precio;
    private int codigo;


    public Item(String nombre, int codigo, double Precio)
    {
        this.nombre = nombre;
        this.precio=Precio;
        this.codigo = codigo;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCode(int newCode){
        codigo = newCode;
    }
    public int getCode(){
        return codigo;
    }
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double Precio) {
        this.precio = Precio;
    }


}
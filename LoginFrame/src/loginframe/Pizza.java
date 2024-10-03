
package loginframe;


public class Pizza {
    private String nombre;
    private double precio;
    private String tamaño; 

    public Pizza(String nombre, double precio, String tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTamaño() {
        return tamaño; 
    }
}



    


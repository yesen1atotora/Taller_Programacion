
package loginframe;

/**
 * La clase Pizza representa una pizza con un nombre, precio y tamaño.
 */
public class Pizza {
    private String nombre;  // Nombre de la pizza
    private double precio;  // Precio de la pizza
    private String tamaño;  // Tamaño de la pizza 

    
    /**
     * Constructor para crear una nueva instancia de Pizza.
     * 
     * @param nombre El nombre de la pizza.
     * @param precio El precio de la pizza.
     * @param tamaño El tamaño de la pizza.
     */
    public Pizza(String nombre, double precio, String tamaño) {
        this.nombre = nombre;
        this.precio = precio;
        this.tamaño = tamaño;
    }

    /**
     * Devuelve el nombre de la pizza.
     * 
     * @return El nombre de la pizza.
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Devuelve el precio de la pizza.
     * 
     * @return El precio de la pizza.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Devuelve el tamaño de la pizza.
     * 
     * @return El tamaño de la pizza.
     */
    public String getTamaño() {
        return tamaño; 
    }
}



    


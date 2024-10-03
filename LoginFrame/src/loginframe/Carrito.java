
package loginframe;

import java.util.ArrayList;

/**
 * La clase Carrito gestiona una lista de pizzas seleccionadas por el usuario.
 */
public class Carrito {
    private final ArrayList<Pizza> pizzas;// Lista de pizzas en el carrito

    /**
     * Constructor que inicializa un carrito vacío.
     */
    public Carrito() {
        pizzas = new ArrayList<>();
    }

    /**
     * Añade una pizza al carrito.
     * 
     * @param pizza La pizza que se quiere añadir al carrito.
     */
    public void añadirPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    /**
     * Devuelve la lista de pizzas en el carrito.
     * 
     * @return Una lista con las pizzas en el carrito.
     */
    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    
    /**
     * Devuelve una representación en forma de cadena de las pizzas en el carrito.
     * 
     * @return Un string que contiene los nombres y precios de las pizzas en el carrito.
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            builder.append(pizza.getNombre()).append(" - ").append(pizza.getPrecio()).append("\n");
        }
        return builder.toString();
    }
}





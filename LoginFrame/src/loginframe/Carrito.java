
package loginframe;

import java.util.ArrayList;

public class Carrito {
    private final ArrayList<Pizza> pizzas;

    public Carrito() {
        pizzas = new ArrayList<>();
    }

    public void añadirPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Pizza pizza : pizzas) {
            builder.append(pizza.getNombre()).append(" - ").append(pizza.getPrecio()).append("\n");
        }
        return builder.toString();
    }
}





package com.designpatterns.pizzafactory;

import com.designpatterns.pizza.*;
import com.designpatterns.pizza.Pizza;

/**
 * Created by dev on 09/10/15.
 */
public abstract class SimplePizzaFactory {
    public com.designpatterns.pizza.Pizza createPizza(String type){
        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")){
            pizza = new ClamPizza();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}

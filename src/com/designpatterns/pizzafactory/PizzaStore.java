package com.designpatterns.pizzafactory;

/**
 * Created by dev on 09/10/15.
 */
public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public abstract Pizza createPizza();

    public Pizza orderPizza(String type){
        Pizza pizza  = createPizza();
        System.out.println("--- Making a " + pizza.getName() + " ---");

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}

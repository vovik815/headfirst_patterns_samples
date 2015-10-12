package com.designpatterns.pizzaaf;



public abstract class PizzaStore {

    protected abstract com.designpatterns.pizzafm.Pizza createPizza(PizzaType pizzaType);

    public com.designpatterns.pizzafm.Pizza orderPizza(PizzaType pizzaType) {
        Pizza pizza = createPizza(pizzaType);

        System.out.println("--- Making a " + pizza.getName() + " ----");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}

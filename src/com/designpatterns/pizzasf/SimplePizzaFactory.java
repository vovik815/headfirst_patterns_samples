package com.designpatterns.pizzasf;


public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        if (type.equals(PizzaType.CHEESE)) {
            return new CheesePizza();
        } else if (type.equals(PizzaType.CLAM)) {
            return new ClamPizza();
        } else if (type.equals(PizzaType.PEPPERONI)) {
            return new PepperoniPizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new VeggiePizza();
        } else return null;
    }
}

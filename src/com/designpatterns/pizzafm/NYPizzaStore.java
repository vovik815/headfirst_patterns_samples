package com.designpatterns.pizzafm;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if (pizzaType.equals(PizzaType.CHEESE)) {
            return new NYStyleCheesePizza();
        } else if (pizzaType.equals(PizzaType.CLAM)) {
            return new NYStyleClamPizza();
        } else if (pizzaType.equals(PizzaType.PEPPERONI)) {
            return new NYStylePepperoniPizza();
        } else if (pizzaType.equals(PizzaType.VEGGIE)) {
            return new NYStyleVeggiePizza();
        } else return null;
    }
}

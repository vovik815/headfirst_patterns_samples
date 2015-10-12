package com.designpatterns.pizzafm;


public class ChicagoPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(PizzaType pizzaType) {
        if (PizzaType.CHEESE.equals(pizzaType)) {
            return new ChicagoStyleCheesePizza();
        } else if (PizzaType.CLAM.equals(pizzaType)) {
            return new ChicagoStyleClamPizza();
        } else if (PizzaType.PEPPERONI.equals(pizzaType)) {
            return new ChicagoStylePepperoniPizza();
        } else if (PizzaType.VEGGIE.equals(pizzaType)) {
            return new ChicagoStyleVeggiePizza();
        } else return null;
    }
}

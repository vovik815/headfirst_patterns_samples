package com.designpatterns.pizzaaf;


public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing " + this.getName());
        this.setDough(ingredientFactory.createDough());
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

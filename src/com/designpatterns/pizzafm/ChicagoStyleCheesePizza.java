package com.designpatterns.pizzafm;


public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        this.setName("Chicago Style Deep Dish Cheese Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");

        this.toppings.add("Shredded Mozzarella Cheese");
    }
}

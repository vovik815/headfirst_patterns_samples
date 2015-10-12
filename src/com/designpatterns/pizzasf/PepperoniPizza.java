package com.designpatterns.pizzasf;


public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        this.setName("Pepperoni Pizza");
        this.setDough("Crust");
        this.setSauce("Marinara sauce");
        this.toppings.add("Sliced Pepperoni");
        this.toppings.add("Sliced Onion");
        this.toppings.add("Grated parmesan cheese");
    }
}

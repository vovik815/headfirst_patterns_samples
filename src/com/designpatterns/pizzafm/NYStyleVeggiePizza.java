package com.designpatterns.pizzafm;


public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.setName("NY Style Veggie Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");

        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Garlic");
        this.toppings.add("Onion");
        this.toppings.add("Mushrooms");
        this.toppings.add("Red Pepper");

    }
}

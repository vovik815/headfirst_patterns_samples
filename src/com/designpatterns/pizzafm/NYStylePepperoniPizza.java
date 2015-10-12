package com.designpatterns.pizzafm;


public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza() {
        this.setName("NY Style Pepperoni Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");

        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Sliced Pepperoni");
        this.toppings.add("Garlic");
        this.toppings.add("Onion");
        this.toppings.add("Mushrooms");
        this.toppings.add("Red Pepper");

    }
}

package com.designpatterns.pizzafm;


public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        this.setName("NY Style Sauce and Cheese Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");

        this.toppings.add("Grated Reggiano Cheese");
    }
}

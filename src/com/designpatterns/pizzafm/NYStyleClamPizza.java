package com.designpatterns.pizzafm;


public class NYStyleClamPizza extends Pizza {
    public NYStyleClamPizza() {
        this.setName("NY Style Clam Pizza");
        this.setDough("Thin Crust Dough");
        this.setSauce("Marinara Sauce");

        toppings.add("Grated Reggiano Cheese");
        toppings.add("Fresh Clams from Long Island Sound");
    }
}

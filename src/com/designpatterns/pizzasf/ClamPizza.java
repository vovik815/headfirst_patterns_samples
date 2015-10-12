package com.designpatterns.pizzasf;


public class ClamPizza extends Pizza {
    public ClamPizza() {
        this.setName("Clam Pizza");
        this.setDough("Thin crust");
        this.setSauce("White garlic sauce");
        this.toppings.add("Clams");
        this.toppings.add("Grated parmesan cheese");
    }
}

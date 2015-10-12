package com.designpatterns.pizzasf;


public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.setName("Cheese Pizza");
        this.setDough("Regular Crust");
        this.setSauce("Marinara Pizza Sauce");
        this.toppings.add("Fresh Mozzarella");
        this.toppings.add("Parmesan");
    }
}

package com.designpatterns.pizzasf;


public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        this.setName("Veggie Pizza");
        this.setDough("Crust");
        this.setSauce("Marinara sauce");
        this.toppings.add("Shredded mozzarella");
        this.toppings.add("Grated parmesan");
        this.toppings.add("Diced onion");
        this.toppings.add("Sliced mushrooms");
        this.toppings.add("Sliced red pepper");
        this.toppings.add("Sliced black olives");
    }
}

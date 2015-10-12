package com.designpatterns.pizzafm;


public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        this.setName("Chicago Style Pepperoni Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");

        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Spinach");
        this.toppings.add("Sliced Pepperoni");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

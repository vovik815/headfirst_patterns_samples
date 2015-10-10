package com.designpatterns.pizzafactory;

/**
 * Created by dev on 09/10/15.
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add(new Topping("Created Reggiano Cheese"));
    }
}

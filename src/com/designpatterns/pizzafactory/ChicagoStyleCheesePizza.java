package com.designpatterns.pizzafactory;

/**
 * Created by dev on 09/10/15.
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza(){
        this.name = "Chicago Style Deep Dish Cheese Pizza";
        this.dough ="Extra Thick Crust Dough";
        this.sauce = "Plum Tomato Sauce";
        toppings.add(new Topping("Shredded Mozzarella Cheese"));
    }

    void cut(){
        System.out.println("Cutting the pizza into square slices");
    }
}

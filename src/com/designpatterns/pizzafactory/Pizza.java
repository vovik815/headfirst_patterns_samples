package com.designpatterns.pizzafactory;

import java.util.ArrayList;

/**
 * Created by dev on 09/10/15.
 */
public abstract class Pizza {

    String name;
    String dough;
    String sauce;

    ArrayList<Topping> toppings = new ArrayList<Topping>();

    void prepare(){
        System.out.println("Preparing " + name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings:");
        for (Topping topping: this.toppings){
            System.out.println("   " + topping);
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return this.name;
    }

}


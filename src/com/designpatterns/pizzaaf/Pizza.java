package com.designpatterns.pizzaaf;


import java.util.ArrayList;


public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    protected abstract void prepare();

    public String getName() {
        return this.name;
    }

    protected Dough getDough() {
        return this.dough;
    }

    protected Sauce getSauce() {
        return this.sauce;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDough(Dough dough) {
        this.dough = dough;
    }

    protected void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    protected void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    protected void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    protected void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(this.getName()).append(" ----\n");
        display.append(this.getDough()).append("\n");
        display.append(this.getSauce()).append("\n");

        return display.toString();
    }
}

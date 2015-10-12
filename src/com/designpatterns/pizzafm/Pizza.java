package com.designpatterns.pizzafm;


import java.util.ArrayList;


public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public String getDough() {
        return this.dough;
    }

    public String getSauce() {
        return this.sauce;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDough(String dough) {
        this.dough = dough;
    }

    protected void setSauce(String sauce) {
        this.sauce = sauce;
    }

    protected void prepare() {
        System.out.println("Preparing " + this.getName());
    }

    protected void bake() {
        System.out.println("Banking " + this.getName());
    }

    protected void cut() {
        System.out.println("Cutting " + this.getName());
    }

    protected void box() {
        System.out.println("Boxing " + this.getName());
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(this.getName()).append(" ----\n");
        display.append(this.getDough()).append("\n");
        display.append(this.getSauce()).append("\n");
        for (String topping : this.toppings) {
            display.append(topping).append("\n");
        }
        return display.toString();
    }
}

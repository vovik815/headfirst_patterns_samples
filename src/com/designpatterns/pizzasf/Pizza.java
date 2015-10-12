package com.designpatterns.pizzasf;


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

    public void setName(String name) {
        this.name = name;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void prepare() {
        System.out.println("Preparing " + this.getName());
    }

    public void bake() {
        System.out.println("Banking " + this.getName());
    }

    public void cut() {
        System.out.println("Cutting " + this.getName());
    }

    public void box() {
        System.out.println("Boxing " + this.getName());
    }

    public String toString() {
        // code to display pizza name and ingredients
        StringBuilder display = new StringBuilder();
        display.append("---- ").append(this.getName()).append(" ----\n");
        display.append(this.getDough()).append("\n");
        display.append(this.getSauce()).append("\n");
        for (String topping : this.toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}

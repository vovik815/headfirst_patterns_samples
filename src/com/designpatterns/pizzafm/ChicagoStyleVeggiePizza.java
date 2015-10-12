package com.designpatterns.pizzafm;


public class ChicagoStyleVeggiePizza extends Pizza {
    public ChicagoStyleVeggiePizza() {
        this.setName("Chicago Deep Dish Veggie Pizza");
        this.setDough("Extra Thick Crust Dough");
        this.setSauce("Plum Tomato Sauce");

        this.toppings.add("Shredded Mozzarella Cheese");
        this.toppings.add("Black Olives");
        this.toppings.add("Spinach");
        this.toppings.add("Eggplant");
    }

    @Override
    protected void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

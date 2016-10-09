package com.pireslabs.designpatterns.builder;

public class ChickenBurger extends  Burger {

    @Override
    public float price() {
        return 35.79F;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
    
}

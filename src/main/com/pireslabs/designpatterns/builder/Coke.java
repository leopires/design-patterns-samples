package com.pireslabs.designpatterns.builder;

public class Coke extends ColdDrink {

    @Override
    public float price() {
        return 9.99F;
    }

    @Override
    public String name() {
        return "Coke";
    }
    
}

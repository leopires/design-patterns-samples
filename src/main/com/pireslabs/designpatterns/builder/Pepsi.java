package com.pireslabs.designpatterns.builder;

public class Pepsi extends ColdDrink {

    @Override
    public float price() {
        return 7.89F;
    }

    @Override
    public String name() {
        return "Pepsi";
    }
    
}

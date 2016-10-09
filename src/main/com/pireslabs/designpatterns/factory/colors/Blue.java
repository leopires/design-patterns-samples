package com.pireslabs.designpatterns.factory.colors;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Using blue color.");
    }
    
}

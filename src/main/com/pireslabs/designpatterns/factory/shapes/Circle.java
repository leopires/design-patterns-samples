package com.pireslabs.designpatterns.factory.shapes;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Hello I'm a Circle.");
    }
    
}

package com.pireslabs.designpatterns.statictest;

public class MyFuckClass {

    private static int instanceCount = 0;
    private int counter = 0;
    
    public MyFuckClass() {
        instanceCount++;
        counter++;
    }
    
    public void getCount() {
        System.out.println("Instances: " + instanceCount);
        System.out.println("Counter: " + counter);
    }
    
    public void changeValues(int value1, int value2) {
        instanceCount = value1;
        counter = value2;
    }
}

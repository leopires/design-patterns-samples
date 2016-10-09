package com.pireslabs.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    
    private List<Item> items;
    
    public Meal() {
        this.items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public float getCost() {
        
        float cost = 0.0f;
        
        for (Item item : this.items) {
            cost+= item.price();
        }
        
        return cost;
    }
    
    public void showItems() {
        for (Item item : this.items) {
            System.out.print("Item: " + item.name());
            System.out.print(", Packing: " + item.packing().pack());
            System.out.println(", Price: " + item.price());
        }
    }
    
    
}
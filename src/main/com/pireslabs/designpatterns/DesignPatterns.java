package com.pireslabs.designpatterns;

import com.pireslabs.designpatterns.builder.Meal;
import com.pireslabs.designpatterns.builder.MealBuilder;
import com.pireslabs.designpatterns.factory.shapes.Circle;
import com.pireslabs.designpatterns.factory.shapes.Retangle;
import com.pireslabs.designpatterns.factory.shapes.Shape;
import com.pireslabs.designpatterns.factory.ShapeFactory;
import com.pireslabs.designpatterns.factory.shapes.Square;
import com.pireslabs.designpatterns.singleton.SingletonObject;

public class DesignPatterns {

    private static final String PATTERN_FACTORY = "FACTORY";
    private static final String PATTERN_SINGLETON = "SINGLETON";
    private static final String PATTERN_BUILDER = "BUILDER";
    
    public static void main(String[] args) {
        
        if(args.length == 0) {
            System.err.println("None Design Pattern selected.");
            System.exit(0);
        }
        
        switch (args[0].toUpperCase()) {
            case PATTERN_FACTORY: {
                executeFactoryPattern();
                break;
            }
            case PATTERN_SINGLETON: {
                executeSingletonPattern();
                break;
            }
            case PATTERN_BUILDER: {
                executeBuilderPattern();
                break;
            }
        }
    }

    public static void executeFactoryPattern() {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape(Retangle.class);
        shape1.draw();

        Shape shape2 = factory.getShape(Square.class);
        shape2.draw();

        Shape shape3 = factory.getShape(Circle.class);
        shape3.draw();
        
        Shape abstractShape = factory.getShape(String.class);
        
        if(abstractShape == null) {
            System.out.println("The Factory is not prepared for this kind of shape.");
        }

    }
    
    public static void executeSingletonPattern() {
        SingletonObject so1 = SingletonObject.getInstance();
        SingletonObject so2 = SingletonObject.getInstance();
        SingletonObject so3 = SingletonObject.getInstance();
        SingletonObject so4 = SingletonObject.getInstance();
        
        System.out.println("Number of instances of SingletonObject: " + so2.getInstanceCount());
    }
    
    public static void executeBuilderPattern() {
        MealBuilder mealBuilder = new MealBuilder();
        Meal meal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        meal.showItems();
        System.out.println("Total Cost: " + meal.getCost());
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }

}

package com.pireslabs.designpatterns;

import com.pireslabs.designpatterns.factory.shapes.Circle;
import com.pireslabs.designpatterns.factory.shapes.Retangle;
import com.pireslabs.designpatterns.factory.shapes.Shape;
import com.pireslabs.designpatterns.factory.ShapeFactory;
import com.pireslabs.designpatterns.factory.shapes.Square;
import com.pireslabs.designpatterns.singleton.SingletonObject;
import com.pireslabs.designpatterns.statictest.MyFuckClass;

public class DesignPatterns {

    public static void main(String[] args) {
        //executeFactoryPattern();
        executeSingletonPattern();
        
        //executeStaticTest();
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
            System.out.println("This factory is not prepared for this type of shape.");
        }

    }
    
    public static void executeSingletonPattern() {
        SingletonObject so1 = SingletonObject.getInstance();
        SingletonObject so2 = SingletonObject.getInstance();
        SingletonObject so3 = SingletonObject.getInstance();
        SingletonObject so4 = SingletonObject.getInstance();
        
        System.out.println("Number of instances of SingletonObject: " + so2.getInstanceCount());
    }
    
    public static void executeStaticTest() {
        MyFuckClass mfc1 = new MyFuckClass();
        MyFuckClass mfc2 = new MyFuckClass();
        MyFuckClass mfc3 = new MyFuckClass();
        
        mfc1.getCount();
        mfc3.getCount();
        mfc1.changeValues(10, 9);
        mfc3.getCount();
        mfc1.getCount();
        mfc2.getCount();
    }

}

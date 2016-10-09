package com.pireslabs.designpatterns.factory;

import com.pireslabs.designpatterns.factory.shapes.Shape;
import com.pireslabs.designpatterns.factory.shapes.Retangle;
import com.pireslabs.designpatterns.factory.shapes.Circle;
import com.pireslabs.designpatterns.factory.shapes.Square;

public class ShapeFactory {
 
    public Shape getShape(Class classe) {
        
        if(classe.getName().equals(Retangle.class.getName())) {
            return new Retangle();
        }
        
        if (classe.getName().equals(Circle.class.getName())) {
            return new Circle();
        }
        
        if (classe.getName().equals(Square.class.getName())) {
            return new Square();
        }
        
        return null;
    }
    
}

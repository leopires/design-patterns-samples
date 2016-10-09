
package com.pireslabs.designpatterns.singleton;

public class SingletonObject {

    private static SingletonObject instance;
    private static int instanceCount = 0;
    
    private SingletonObject() {
        instanceCount++;
    }
    
    public static SingletonObject getInstance() {
        if(instance == null)
            instance = new SingletonObject();
        return instance;
    }
    
    public int getInstanceCount() {
        return instanceCount;
    }
    
    public void sayHelloNurse() {
        System.out.println("Hello!!! Nurse...");
    }
    
}

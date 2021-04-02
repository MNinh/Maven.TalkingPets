package io.zipcoder.polymorphism;

public class Dog extends Pet{

    public Dog (String name, String type){
        super(name, type);
    }

    public Dog(String name){
        super(name);
    }

    public Dog(){
        super.name = "";
    }

    public String speak(){
        return "woof!";
    }

    public String superSpeak(){
        return "super super";

    }
}

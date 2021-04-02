package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat (String name, String type){
        super(name, type);
    }

    public Cat(String name){
        super(name);
    }

    public Cat(){
        super.name = "";
    }

    public String speak(){
        return "meow!";
    }

    public String superSpeak(){
        return "super super";

    }
}

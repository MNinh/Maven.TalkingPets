package io.zipcoder.polymorphism;

public class Dragon extends Pet{

    public Dragon (String name, String type){
        super(name, type);
    }

    public Dragon(String name){
        super(name);
    }

    public Dragon(){
        super.name = "";
    }

    public String speak(){
        return "Behold my true form.";
    }

    public String superSpeak(){
        return "super super";

    }
}

package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest{
    // Test written by xyuan04

    @Test
    public void constructorTest() {
        // : Given
        String name = "Entei";

        // : When
        Dog dog = new Dog(name);
        String actualName = dog.getName();

        // : Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void setNameTest() {
        // : Given
        String name = "Entei";

        // : When
        Dog dog = new Dog(name);
        String expectedName = "Suicune";
        dog.setName(expectedName);
        String actualName = dog.getName();

        // : Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void superSpeakTest() {
        // : Given
        String name = "Raikou";
        Pet dog = new Dog(name);

        // : When
        String expected = "super super";
        String actual = dog.superSpeak();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String name = "Arcanine";
        Dog dog = new Dog(name);

        // : When
        String expected = "woof!";
        String actual = dog.speak();

        // : Then
        Assert.assertEquals(expected, actual);
    }

}

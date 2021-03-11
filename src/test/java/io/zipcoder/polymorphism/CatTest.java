package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    // Test written by xyuan04

    @Test
    public void constructorTest() {
        // : Given
        String name = "Simba";

        // : When
        Cat cat = new Cat(name);
        String actualName = cat.getName();

        // : Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void setNameTest() {
        // : Given
        String name = "Simba";
        Cat cat = new Cat(name);

        // : When
        String expectedName = "Scar";
        cat.setName(expectedName);
        String actualName = cat.getName();

        // : Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void superSpeakTest() {
        // : Given
        String name = "Salem";
        Pet cat = new Cat(name);

        // : When
        String expected = "super super";
        String actual = cat.superSpeak();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String name = "Salem";
        Pet cat = new Cat(name);

        // : When
        String expected = "meow!";
        String actual = cat.speak();

        // : Then
        Assert.assertEquals(expected, actual);
    }
}

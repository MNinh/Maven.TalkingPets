package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DragonTest {
    // Test written by xyuan04

    @Test
    public void constructorTest() {
        // : Given
        String name = "Mushu";

        // : When
        Dragon dragon = new Dragon(name);
        String actualName = dragon.getName();

        // : Then
        Assert.assertEquals(name, actualName);
    }

    @Test
    public void setNameTest() {
        // : Given
        String name = "Dragonite";

        // : When
        Dragon dragon = new Dragon(name);
        String expectedName = "Shenron";
        dragon.setName(expectedName);
        String actualName = dragon.getName();

        // : Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void superSpeakTest() {
        // : Given
        String name = "Toothless";
        Pet dragon = new Dragon(name);

        // : When
        String expected = "super super";
        String actual = dragon.superSpeak();

        // : Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String name = "Shyvana";
        Dragon dragon = new Dragon(name);

        // : When
        String expected = "Behold my true form.";
        String actual = dragon.speak();

        // : Then
        Assert.assertEquals(expected, actual);
    }
}

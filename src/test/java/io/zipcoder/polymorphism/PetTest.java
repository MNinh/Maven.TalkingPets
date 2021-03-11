package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void nullConstructorTest() {
        // : Given
        Pet pet = new Pet();

        // : When
        String expectedName = "basicB";
        String actualName = pet.getName();

        // : Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorTest() {
        // : Given
        String expectedName = "Casper";
        Pet pet = new Pet(expectedName);

        // : When
        String actualName = pet.getName();

        // : Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // : Given
        String name = "Sleipnir";
        Pet pet = new Pet(name);

        // : When
        String expected = "Super super"
        String actual = pet.speak();

        // : Then
        Assert.assertEquals(expected, actual);
    }
}

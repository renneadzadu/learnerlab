package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test

    public void testConstructor(){
        //Given
        Person person = new Person(0000, "Renne");
        String expected = "Renne";
        long expectedId = 3255;

        //when
        String actual = person.getName();
        long acturalId = 3255;

        //then
        Assert.assertEquals(expected,actual);
        Assert.assertEquals(expectedId, acturalId);
    }

    @Test

    public void testSetName(){
        //Given
        Person person = new Person("Renne");
        String expectedName = "Renne";

        //when
        String acturalName = person.getName();

        //then
        Assert.assertEquals(expectedName,acturalName);


    }

}

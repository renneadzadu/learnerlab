package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;

public class TestStudent {
    //Create a TestStudent class.
    //Create a testImplementation method that asserts that a Student is an instanceof a Learner.
    //Create a testInheritance method that asserts that a Student is an instanceof a Person.
    //Create a testLearn method that ensures a Student's totalStudyTime instance variable
    // is incremented by the specified numberOfHours by invoking the .learn method.
    @Test
    public  void testImplementation () {

        //Given
        Student student = new Student(2,"Mark");
        String expected = "Mark";

        //when
        String actual =student.getName();

        //then
        Assert.assertThat(student, instanceOf (Learner.class));

    }
    @Test
    public void testInheritance (){
        // given
        Student student = new Student(6, "Matt");
        //then
        Assert.assertTrue(student instanceof Person);


    }

    @Test
    public void testLearn(){
        Student student = new Student(5, "Abby");
        student.setTotalStudyTime(25.0);
        student.learn(25);
        double expected = 50.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected, actual,0);
    }
}

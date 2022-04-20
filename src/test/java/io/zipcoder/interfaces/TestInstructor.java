package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {

    @Test
    public void implementationTest() {
        Instructor instructor = new Instructor(0, "Ted");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void inheritanceTest() {
        Instructor instructor = new Instructor(0, "Mark");
        Assert.assertTrue(instructor instanceof Person);
    }

    @Test
    public void teachTest() {
        Instructor instructor = new Instructor(5, "John");
        Student student = new Student(4, "Ruth");
        instructor.teach(student, 5.0);
        Double expected = 5.0;
        double actual = student.getTotalStudyTime();

        Assert.assertEquals(expected,actual,0);
    }


    @Test
    public void lectureTest() {
        Instructor instructor = new Instructor(2, "Albert");
        Student student1 = new Student(5, "mark");
        Student student2 = new Student(6, "luke");
        Student student3 = new Student(7,"baby");
        Learner[] learners = {student1, student2, student3};
        instructor.lecture(learners,50);
        instructor.lecture(learners,50);
        instructor.lecture(learners,50);

        Assert.assertEquals(50,student1.getTotalStudyTime(),0);

    }
}


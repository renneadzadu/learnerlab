package io.zipcoder.interfaces;

public interface Teacher {
    abstract void teach(Learner learner, double numberOfHours);
    abstract void lecture(Learner[] learners, double numberOfHours);
}

package io.zipcoder.interfaces;

public class Student extends Person implements Learner{

private double totalStudyTime;


    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {

        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

}

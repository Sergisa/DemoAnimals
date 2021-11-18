package com.company;

public class Student extends Man {
    private int course;

    public Student(int age, int course) {
        super(age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


}

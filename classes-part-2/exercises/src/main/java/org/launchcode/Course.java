package org.launchcode;

import java.util.ArrayList;
import java.util.Objects;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // Constructor
    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    // Custom toString method
    @Override
    public String toString() {
        return "Course: " + topic + "\nInstructor: " + instructor.getFirstName() + " " + instructor.getLastName() +
                "\nEnrolled Students: " + enrolledStudents.size();
    }

    // Custom equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Course course = (Course) obj;
        return topic.equals(course.topic) && instructor.equals(course.instructor);
    }

    // Getters and Setters
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }
}


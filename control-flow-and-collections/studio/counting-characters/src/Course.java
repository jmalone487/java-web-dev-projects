package exercises.classespart1;

import exercises.classespart2.Teacher;
import java.util.ArrayList;

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

    // Getters
    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    // Setters
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setInstructor(Teacher instructor) {
        this.instructor = instructor;
    }

    // Methods to manage enrolled students
    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(Student student) {
        enrolledStudents.remove(student);
    }

    // You can add more methods if needed for managing students, like listing them
}

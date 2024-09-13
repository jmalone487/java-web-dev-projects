package org.launchcode;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // Constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    // Determine the grade level of the student based on numberOfCredits
    public String getGradeLevel() {
        if (this.numberOfCredits < 30) {
            return "Freshman";
        } else if (this.numberOfCredits < 60) {
            return "Sophomore";
        } else if (this.numberOfCredits < 90) {
            return "Junior";
        } else {
            return "Senior";
        }
    }

    // Update numberOfCredits and GPA based on courseCredits and grade
    public void addGrade(int courseCredits, double grade) {
        // Calculate total quality score: current GPA * current credits + new grade * new credits
        double totalQualityScore = this.gpa * this.numberOfCredits + grade * courseCredits;

        // Update the number of credits
        this.numberOfCredits += courseCredits;

        // Calculate the new GPA: total quality score / total number of credits
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    // Custom toString method for a well-formatted string representation of the object
    @Override
    public String toString() {
        return name + " (ID: " + studentId + ") has " + numberOfCredits + " credits and a GPA of " + gpa + ".";
    }

    // Custom equals method that checks if two students are equal based on studentId
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return studentId == student.studentId;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    // Main method for testing
    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);

        // Adding grades
        sally.addGrade(12, 3.5);
        System.out.println(sally);

        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}

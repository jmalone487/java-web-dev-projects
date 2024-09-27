package org.launchcode;

public class Student {

    private static int nextStudentId = 1;
    private final String name;
    private final int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // Constructor
    public Student(String name) {
        this.name = name;
        this.studentId = nextStudentId++;
    }

    public Student(String name, int numberOfCredits, double gpa) {
        this(name);
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
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
        if (courseCredits <= 0) {
            throw new IllegalArgumentException("Course credits must be positive.");
        }
        if (grade < 0.0 || grade > 4.0) {
            throw new IllegalArgumentException("Grade must be between 0.0 and 4.0.");
        }

        // Calculate total quality score
        double totalQualityScore = this.gpa * this.numberOfCredits + grade * courseCredits;

        // Update the number of credits
        this.numberOfCredits += courseCredits;

        // Calculate the new GPA
        this.gpa = totalQualityScore / this.numberOfCredits;
    }

    // Custom toString method
    @Override
    public String toString() {
        return name + " (ID: " + studentId + ") has " + numberOfCredits + " credits and a GPA of " + gpa + ".";
    }

    // Custom equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;
        return studentId == student.studentId;
    }

    // Getters
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

    // Main method for testing
    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);

        // Adding grades
        sally.addGrade(12, 3.5);
        System.out.println(sally);

        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}

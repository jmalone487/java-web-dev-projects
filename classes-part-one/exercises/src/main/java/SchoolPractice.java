public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate the Student class
        Student student = new Student();

        // Set the student details
        student.setName("John Doe");
        student.setStudentId(1);
        student.setNumberOfCredits(1);
        student.setGpa(4.0);

        // Print out the student details
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Credits: " + student.getNumberOfCredits());
        System.out.println("GPA: " + student.getGpa());
    }
}



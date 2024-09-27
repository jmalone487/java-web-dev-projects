public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String topic, Teacher instructor) {
        this.topic = topic;
        this.instructor = instructor;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getTopic() {
        return topic;
    }

    public Teacher getInstructor() {
        return instructor;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void addStudent(Student student) {
        if (!enrolledStudents.contains(student)) {  // Check for duplicates
            enrolledStudents.add(student);
        } else {
            System.out.println("Student already enrolled.");
        }
    }

    public double getAverageGrade() {
        if (enrolledStudents.isEmpty()) {
            return 0.0;
        }
        double total = 0;
        for (Student student : enrolledStudents) {
            total += student.getGrade();
        }
        return total / enrolledStudents.size();
    }

    public void displayCourseInfo() {
        System.out.println("Course Topic: " + topic);
        System.out.println("Instructor: " + instructor.getName());
        System.out.println("Number of Students Enrolled: " + enrolledStudents.size());
        displayEnrolledStudents(); // Display enrolled students
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println("- " + student.getName());
        }
    }

    @Override
    public String toString() {
        return "Course{" +
                "topic='" + topic + '\'' +
                ", instructor=" + instructor.getName() +
                ", enrolledStudents=" + enrolledStudents.size() +
                '}';
    }
}

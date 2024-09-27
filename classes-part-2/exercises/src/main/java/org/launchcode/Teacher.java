package org.launchcode;

import java.util.Objects;

public class Teacher {
    private final String firstName;
    private final String lastName;
    private final String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        setYearsTeaching(yearsTeaching); // Use setter for validation
    }

    // Setters
    public void setYearsTeaching(int yearsTeaching) {
        if (yearsTeaching < 0) {
            throw new IllegalArgumentException("Years of teaching cannot be negative.");
        }
        this.yearsTeaching = yearsTeaching;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public int getYearsTeaching() {
        return yearsTeaching;
    }

    // Custom toString method
    @Override
    public String toString() {
        return String.format("%s %s teaches %s and has %d years of experience.", firstName, lastName, subject, yearsTeaching);
    }

    // Custom equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Teacher teacher = (Teacher) obj;
        return firstName.equals(teacher.firstName) && lastName.equals(teacher.lastName);
    }

    // Custom hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

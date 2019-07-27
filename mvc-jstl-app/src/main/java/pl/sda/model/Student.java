package pl.sda.model;

import java.time.LocalDate;

public class Student {

    private int id;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    public Student(int id, String firstName, String lastName, LocalDate dateOfBirth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}

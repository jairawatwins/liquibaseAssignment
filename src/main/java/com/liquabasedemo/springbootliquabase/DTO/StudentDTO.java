package com.liquabasedemo.springbootliquabase.DTO;

import com.liquabasedemo.springbootliquabase.entity.Department;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class StudentDTO {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private int studentId;
    private String firstName;
    private String lastName;
    private Department department;

    public StudentDTO() {
    }

    public StudentDTO(int studentId, String firstName, String lastName, Department department) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "StudentDTO{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                '}';
    }
}

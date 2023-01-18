package com.liquabasedemo.springbootliquabase.entity;

import jakarta.persistence.*;

import java.util.Set;
@Entity
@Table(name = "department")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPT_ID")
    private int deptId;
    @Column(name = "DEPT_NAME")
    private String deptName;

//    @OneToMany(targetEntity = Student.class, cascade=CascadeType.ALL, fetch = FetchType.EAGER)
//    @Column(name = "students")
    private Set<Student> students;

    public Department() {
    }

    public Department(int deptId, String deptName, Set<Student> students) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.students = students;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String depName) {
        this.deptName = depName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", students=" + students +
                '}';
    }
}

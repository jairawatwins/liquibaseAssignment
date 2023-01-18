package com.liquabasedemo.springbootliquabase.Service.Implement;

import com.liquabasedemo.springbootliquabase.entity.Department;
import com.liquabasedemo.springbootliquabase.entity.Student;

import java.util.List;

public interface IStudentService {

    Student saveStudent(Student student);

    Department saveDepartment(Department department);

    List<Student> getDataList();

    Student getDataListId(int id);

    void deleteContactById(int id);


    Student getDetailByName(String name);
}

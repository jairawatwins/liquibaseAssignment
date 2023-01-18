package com.liquabasedemo.springbootliquabase.Service;

import com.liquabasedemo.springbootliquabase.Repository.DepartmentRepo;
import com.liquabasedemo.springbootliquabase.Repository.StudentRepo;
import com.liquabasedemo.springbootliquabase.Service.Implement.IStudentService;
import com.liquabasedemo.springbootliquabase.entity.Department;
import com.liquabasedemo.springbootliquabase.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    DepartmentRepo departmentRepo;


    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepo.save(department);
    }



    @Override
    public List<Student> getDataList() {
        return studentRepo.findAll();
    }


    @Override
    public Student getDataListId(int id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public void deleteContactById(int id) {
        studentRepo.deleteById(id);
    }

    @Override
    public Student getDetailByName(String name) {
        return studentRepo.findByName(name);
    }
}

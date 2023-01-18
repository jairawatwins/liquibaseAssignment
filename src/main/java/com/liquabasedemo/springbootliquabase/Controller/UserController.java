package com.liquabasedemo.springbootliquabase.Controller;

import com.liquabasedemo.springbootliquabase.Service.Implement.IStudentService;
import com.liquabasedemo.springbootliquabase.entity.Department;
import com.liquabasedemo.springbootliquabase.entity.Student;
import com.liquabasedemo.springbootliquabase.Service.Implement.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    IUserInfoService userInfoService;

    @Autowired
    IStudentService studentService;


    @PostMapping("/saveStudent")
    public Student saveStudent(@RequestBody Student student){
        return  studentService.saveStudent(student);
    }

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department){
        return studentService.saveDepartment(department);
    }

    @GetMapping("/contacts")
    public List<Student> getData(){
        return studentService.getDataList();

    }


    @GetMapping("/contact/{id}")
    public Student getContactById(@PathVariable("id") int id) {

        return studentService.getDataListId(id);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteContactById(@PathVariable("id") int id){
        studentService.deleteContactById(id);
        return "Student is deleted";
    }


    @GetMapping("/contact/name/{name}")
    public Student getDetailByName(@PathVariable("name") String name ){
        return studentService.getDetailByName(name);
    }



}

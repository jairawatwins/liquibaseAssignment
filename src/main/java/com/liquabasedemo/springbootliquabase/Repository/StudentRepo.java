package com.liquabasedemo.springbootliquabase.Repository;

import com.liquabasedemo.springbootliquabase.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
    Student findByName(String name);


}

package com.liquabasedemo.springbootliquabase.Repository;

import com.liquabasedemo.springbootliquabase.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,Integer> {
}

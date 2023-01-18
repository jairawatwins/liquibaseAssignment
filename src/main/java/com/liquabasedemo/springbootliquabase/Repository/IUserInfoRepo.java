package com.liquabasedemo.springbootliquabase.Repository;


import com.liquabasedemo.springbootliquabase.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserInfoRepo extends JpaRepository<UserInfo,Integer> {

}


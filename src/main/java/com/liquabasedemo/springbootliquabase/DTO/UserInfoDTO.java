package com.liquabasedemo.springbootliquabase.DTO;

import jakarta.persistence.*;

import java.util.Date;

public class UserInfoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    private String name;

//    private String fatherName;
//
//    private String motherName;

    private long mobileNo;

//    private String email;
//
//    @Temporal(TemporalType.DATE)
//    private Date dateOFHire;

//    @ManyToOne(targetEntity = Country.class, fetch = FetchType.EAGER)
//    @JoinColumn(name = "BIRTH_COUNTRY_ID")
//    private Country country;

//    private String jobcode;
//
//    private String gender;

    public UserInfoDTO() {
    }

    public UserInfoDTO(Integer id, String name, long mobileNo) {
        Id = id;
        this.name = name;
        this.mobileNo = mobileNo;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(long mobileNo) {
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "UserInfoDTO{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

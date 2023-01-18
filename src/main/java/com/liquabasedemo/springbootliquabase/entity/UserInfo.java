package com.liquabasedemo.springbootliquabase.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "USER_INFO")
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    private String name;

//    private String fatherName;

//    private String motherName;

    private long mobileNo;



//    private String email;

//    @Temporal(TemporalType.DATE)
//    private Date dateOFHire;

//    @ManyToOne(targetEntity = Country.class, fetch = FetchType.EAGER)
//    @JoinColumn(name = "BIRTH_COUNTRY_ID")
//    private Country country;

//    private String jobcode;
//
//    private String gender;

    public UserInfo() {
    }

    public UserInfo(Integer id, String name, long mobileNo) {
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
        return "UserInfo{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }
}

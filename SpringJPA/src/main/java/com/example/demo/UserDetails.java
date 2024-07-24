package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name="UserDetails")
public class UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int mobile_no;

    public UserDetails(int id, String name, int mobile_no) {
        this.id = id;
        this.name = name;
        this.mobile_no = mobile_no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(int mobile_no) {
        this.mobile_no = mobile_no;
    }
}

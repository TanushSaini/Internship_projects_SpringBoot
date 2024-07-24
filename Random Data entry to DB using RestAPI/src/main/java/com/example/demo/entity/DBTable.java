package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="randomentries")
public class DBTable{
    @Id
    private Integer SNo;
    private String Name;
    private String Surname;
    private Integer Age;
    private Integer Salary;
    private String Role;

    public Integer getSNo() {
        return SNo;
    }

    public void setSNo(Integer SNo) {
        this.SNo = SNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Integer getSalary() {
        return Salary;
    }

    public void setSalary(Integer salary) {
        Salary = salary;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }
}
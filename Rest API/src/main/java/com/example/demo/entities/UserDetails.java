package com.example.demo.controller.entities;

import javax.persistence.*;

@Entity
@Table(name="UserDetails")
public class UserDetails{
   @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String Tech;

    public UserDetails(int id, String name, String tech) {
        this.id = id;
        this.name = name;
        this.Tech = tech;
    }

    public UserDetails() {
        super();
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

    public String getTech() {
        return Tech;
    }

    public void setTech(String tech) {
        Tech = tech;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Tech='" + Tech + '\'' +
                '}';
    }
}

package com.example.demo.services;

import com.example.demo.controller.entities.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServices {
    List<UserDetails> l1;
    public UserServices(){
     l1=new ArrayList<>();
     l1.add(new UserDetails(1,"User01","Java"));
     l1.add(new UserDetails(2,"User02","SpringBoot"));
    }
    public List<UserDetails> getDetails(){
        return l1;
    };
}

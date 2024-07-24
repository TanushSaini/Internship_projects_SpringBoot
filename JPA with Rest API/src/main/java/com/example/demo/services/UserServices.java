package com.example.demo.services;

import com.example.demo.entities.UserEntries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices{
    @Autowired
    private UserDao dao;

    public List<UserEntries> getEntry(){
        return dao.findAll();
    }


    public UserEntries addEntry(UserEntries userEntry) {
        dao.save(userEntry);
        return userEntry;
    }
}

package com.example.demo.services;

import com.example.demo.entities.UserEntries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<UserEntries, Integer> {
}

package com.example.demo.services;

import com.example.demo.entity.DBTable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public  interface Dao extends JpaRepository<DBTable,String> {
}

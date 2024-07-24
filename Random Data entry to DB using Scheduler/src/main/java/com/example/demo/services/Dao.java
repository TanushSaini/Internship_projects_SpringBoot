package com.example.demo.services;

import com.example.demo.entity.DBTable;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public  interface Dao extends JpaRepository<DBTable,Integer> {
    @Query("SELECT e FROM DBTable e")
    public List<DBTable> getAll();
}

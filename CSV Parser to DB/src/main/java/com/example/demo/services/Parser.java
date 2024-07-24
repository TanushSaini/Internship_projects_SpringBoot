package com.example.demo.services;

import com.example.demo.entity.DBTable;
import com.example.demo.services.Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.io.*;
@Service
public class Parser{
    @Autowired
    private Dao d;

    public void entry() {
        DBTable db = new DBTable();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\SpringProject\\CSV Parser to DB\\src\\main\\resources\\Placement_Data_Full_Class.csv"));
            String header = reader.readLine();
            // System.out.println(header);
            String line = reader.readLine();
            if (line == null) {System.out.print("The document is empty");}
            else{
                while (line != null) {
                    String values[] = line.split(",");
                    System.out.println("Adding to database");
                    //for (int i = 0; i < values.length; i++) {

                    if(values.length==14){
                        db.setSno(Integer.parseInt(values[0]));
                        db.setGender(values[1]);
                        db.setPercent10th(Float.parseFloat(values[2]));
                        db.setSSCBoard(values[3]);
                        db.setPercent12th(Float.parseFloat(values[4]));
                        db.setHSCBoard(values[5]);
                        db.setStream12th(values[6]);
                        db.setDegreePercent(Float.parseFloat(values[7]));
                        db.setDegreeStream(values[8]);
                        db.setWorkExp(values[9]);
                        db.setSpecialisation(values[10]);
                        db.setMBAPercent(Float.parseFloat(values[11]));
                        db.setStatus(values[12]);
                        db.setSalary(Integer.parseInt(values[13]));}
                        else{
                            System.out.println("Invalid Entry");
                            line = reader.readLine();
                        }
                        d.save(db);

                        System.out.print(values[0] + " "+values.length);
                    //}
                    System.out.println();
                    line = reader.readLine();
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
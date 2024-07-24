package com.example.demo.services;

import com.example.demo.entity.DBTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Service
public class Parser{

    @Autowired
    private Dao d;

    public void parseCSV(){
        RandomDataGenerator ran = new RandomDataGenerator();
        String path = "D:\\SpringProject\\Random Data entry to DB using Scheduler\\src\\main\\resources\\";
        SimpleDateFormat format = new SimpleDateFormat("dd-MM hh");
        String newName = format.format(Calendar.getInstance().getTime());

        try{ BufferedReader reader = new BufferedReader(new FileReader(path+"F"+newName));
            String header = reader.readLine();
            // System.out.println(header);
            String line = reader.readLine();
            if (line == null) {
                System.out.print("The document is empty");}
            else{
                while (line != null) {
                    DBTable db = new DBTable();
                    String values[] = line.split(",");
                    System.out.println("Adding to database");
                    if (values.length == 6) {
                        db.setSNo(Integer.parseInt(values[0]));
                        db.setName(values[1]);
                        db.setSurname(values[2]);
                        db.setAge(Integer.parseInt(values[3]));
                        db.setSalary(Integer.parseInt(values[4]));
                        db.setRole(values[5]);
                    }
                    else{
                            System.out.println("Invalid Entry");
                            line = reader.readLine();
                    }
                        d.save(db);

                        System.out.print(values[0] + " " + values.length);
                        System.out.println();
                        line = reader.readLine();
                    }
                }
                reader.close();
            }catch(IOException e){
        System.out.println("IOException "+e);}
    }

}
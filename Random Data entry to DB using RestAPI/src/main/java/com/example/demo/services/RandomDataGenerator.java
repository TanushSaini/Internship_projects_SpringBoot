package com.example.demo.services;

import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
@Service
public class RandomDataGenerator{
    public void randomData(){
        Random r = new Random();

        String names[]={"Tanush","Avinash","Shubham","Isha","Akshay","Vishakha","Kartik","Aman","Shikha","Deepak"};
        String surname[]={"Bhardwaj","Saini","Tiwari","Sharma","Singh","Prajapat","Verma","Upadhyay","Joshi","Nex"};
        String department[]={"Manager","Developer","Tester","Requirement Owner","QA"};

        SimpleDateFormat format = new SimpleDateFormat("dd-MM hh");

        try{
            String filePath = "D:\\SpringProject\\Random Data entry to DB\\src\\main\\resources\\";
            String newName = format.format(Calendar.getInstance().getTime());

            FileWriter writer = new FileWriter(filePath+"F"+newName);

            writer.write("SNo,Name,Surname,Age,Salary,Role,");
            writer.write("\n");

            for(int i=1;i<=10;i++) {
                writer.write(Integer.toString(i));
                writer.write(",");
                writer.write(names[r.nextInt(9)]);
                writer.write(",");
                writer.write(surname[r.nextInt(9)]);
                writer.write(",");
                writer.write(String.valueOf(20+r.nextInt(40)));
                writer.write(",");
                writer.write(String.valueOf(600000+r.nextInt(2400000)));
                writer.write(",");
                writer.write(department[r.nextInt(5)]);
                writer.write(",");
                writer.write("\n");
        }
        writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class TestFile {
    public static void main(String args[]){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\SpringProject\\CSV to DB\\src\\main\\resources\\Placement_Data_Full_Class.csv"));
            String header = reader.readLine();
           // System.out.println(header);
           String line = reader.readLine();
           if(line==null) {
               System.out.print("The document is empty");
           }
           else {

               while (line != null) {
                   String values[] = line.split(",");
                   for (int i = 0; i < values.length; i++) {
                       System.out.print(values[i] + ",");
                   }
                   System.out.println();
                   line = reader.readLine();
               }
           }


            reader.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
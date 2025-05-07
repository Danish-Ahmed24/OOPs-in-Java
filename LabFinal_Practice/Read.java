package LabFinal_Practice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Read{}
class Write {
    public static void main(String[] args) {
        try{
        BufferedWriter writer = new BufferedWriter(new FileWriter("invent.txt",true));
        writer.write("rafay");
        writer.write("3");
        writer.newLine();
        writer.close();
        File file= new File("invent.txt");
        file.delete();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }




        //agar wrtie karoge toh porana sara data clear ho k shuru hoga writing

        //jo hota hai porana kam osko saht rak k dusra kam hota hai

    }
}

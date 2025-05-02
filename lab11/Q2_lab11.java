package lab11;

import java.io.*;

public class Q2_lab11 {
    public static void main(String[] args) {
        File file = new File("Danish.txt");
        try
        {
            BufferedWriter write = new BufferedWriter(new FileWriter(file.getPath()));
            write.write("Danish Ahmed");
            write.newLine();
            write.write("Aspiring Software Engineer Insha'Allah <3");
            write.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
            String line;
            BufferedReader read = new BufferedReader(new FileReader(file.getPath()));
            while((line=read.readLine())!=null)
            {
                System.out.println(line);
            }
            read.close();
        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}

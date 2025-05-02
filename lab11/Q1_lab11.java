package lab11;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class Q1_lab11 {
    public static void main(String[] args) {
        ArrayList<String> elements = new ArrayList<>();
        elements.add("apple");
        elements.add("mango");
        elements.add("orange");
        elements.add("grapes");
        elements.add("melon");
        try {

            BufferedWriter file = new BufferedWriter(new FileWriter("Q1_lab11.txt"));
            for(String element : elements)
            {
                file.write(element);
            }
            file.close();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        File file = new File("Q1_lab11.txt");
        if(file.delete()){
            System.out.println("Deleted success");
        }else{
            System.out.println("Cant delete");
        }
    }
}

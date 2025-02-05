package Lab_2_Questions;

import java.util.ArrayList;

public class Q2 {
    public static void main(String[] args) {
        ArrayList<String> toDo = new ArrayList<String>();
        toDo.add("Buy groceries");
        toDo.add("Clean the house");
        toDo.add("Finish homework");
        toDo.add("Call Mom");
        toDo.add("Prepare dinner");

        for(String a : toDo) {
            System.out.println(a);
        }

        //after removing
        toDo.remove("Call Mom");
        System.out.println("\nAfter removing Call mom\n");
        for(String a: toDo)
        {
            System.out.println(a);
        }

    }
}

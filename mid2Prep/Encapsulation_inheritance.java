package mid2Prep;
import java.util.Arrays;
import java.util.List;

class TestArrayList {

    // Method that accepts a List as a parameter
    public static void printList(List<String> list) {
        // Loop through the List and print each element
        for (String item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // Directly pass a List using Arrays.asList() to the method
        printList(Arrays.asList("Apple", "Banana", "Cherry"));
    }
}

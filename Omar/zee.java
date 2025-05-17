package Omar;

import java.util.ArrayList;
import java.util.Arrays;

public class zee {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("1");
        arrayList.add("1");

        ArrayList<String> temp = new ArrayList<>();
        temp.add("temp");
        temp.add("temp");
        temp.add("temp");

        String[] ss = {"a","b","c"};
        arrayList.addAll(temp);
        arrayList.addAll(Arrays.asList(ss));
        System.out.println(arrayList);

    }
}

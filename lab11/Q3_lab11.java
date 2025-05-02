package lab11;

public class Q3_lab11 {
    public static <T extends Comparable<T>> T findMax(T[] arr)
    {
        if(arr==null || arr.length==0)
        {
            return null;
        }
        T max = arr[0];
        for(int i=0; i< arr.length;i++)
        {
            if(arr[i].compareTo(max)>0)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        String strs[] ={"Apple","mango","melon","tomato","potato"};
        Integer ints[] ={1,2,34,32};
        System.out.println("Max Str: "+findMax(strs));
        System.out.println("Max Int: "+findMax(ints));
    }
}

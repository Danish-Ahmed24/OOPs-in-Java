package lab9;

class Sorting{
    public String[] sort(String[] array){
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=0;j< array.length-1-i;j++)
            {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    String temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public String[] sort(String[] array,boolean descending){
        if(!descending) {
            return sort(array);
        }else{
            for(int i=0;i<array.length-1;i++)
            {
                for(int j=0;j< array.length-1-i;j++)
                {
                    if (array[j].compareTo(array[j + 1]) < 0) {
                        String temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array;
        }
    }
    public int[] sort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
    public int[] sort(int[] array,boolean descending)
    {
        if(!descending) {
            return sort(array);
        }else{
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j + 1];
                        array[j + 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array;
        }

    }
    public void displayArray(int[] array)
    {
        System.out.print("{");
        for(int a:array)
        {
            System.out.print(a+",");
        }
        System.out.print("\b}\n");
    }
    public void displayArray(String [] array)
    {
        System.out.print("{");
        for(String a:array)
        {
            System.out.print(a+",");
        }
        System.out.print("\b}\n");
    }
}

public class Q9_lab9 {
    public static void main(String[] args) {
        int []intArray={1,7,3,8,6,2,};
        String []stringArray={"Hi","Bro","Have","a","nice","day"};
        Sorting s = new Sorting();
        s.displayArray(s.sort(intArray));
        s.displayArray(s.sort(intArray,true));
        s.displayArray(s.sort(stringArray));
        s.displayArray(s.sort(stringArray,true));
    }
}

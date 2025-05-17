package Omar;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private int chair;
    private ArrayList<String> hh;
    int x=43;
    public Library(ArrayList<Book> books)
    {
        //new ArrayList<>()
        this.books=books;

        hh=new ArrayList<>();//compo
    }

    public void addChair(int chair)
    {
        this.chair=chair;
    }

    public void printff()
    {
        System.out.println(this.x);
    }
    public void change(int x)
    {
        this.x=x;
    }
}

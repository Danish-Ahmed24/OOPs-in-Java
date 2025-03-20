package Pastpaper2.Q1;

public class Book {
    private static int counter=1;
    private int id;
    private String title;
    private float price;
    private int noOfCopies;

    public Book(String title,float price,int noOfCopies)
    {
        this.id=getCounter();
        this.title=title;
        this.price=price;
        this.noOfCopies=noOfCopies;
    }
    public int getCounter()
    {
        return counter++;
    }
    public void display()
    {
        System.out.println("-------------------");
        System.out.println("ID: "+this.id);
        System.out.println("Title: "+this.title);
        System.out.println("Price: "+this.price);
        System.out.println("-------------------");
    }
}

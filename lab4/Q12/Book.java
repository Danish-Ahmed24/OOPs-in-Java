package Q12;


public class Book {
    private String title,author;
    private float price;
    Book(String title)
    {
        this.title = title;
        this.author="Unknown";
        this.price=0.0f;
    }
    Book(String title ,String author)
    {
        this.title = title;
        this.author=author;
        this.price=0.0f;
    }
    Book(String title ,String author,float price)
    {
        this.title = title;
        this.author=author;
        this.price=price;
    }
    public void displayInfo()
    {
        System.out.println("\nBook Title: "+this.title+", Author: "+this.author+", Price: "+this.price);
    }
}

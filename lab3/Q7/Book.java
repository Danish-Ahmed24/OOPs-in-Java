package Q7;

public class Book {
    String title,author;
    double price;
    public Book (String title, String author, double price){
        setTitle(title);
        setAuthor(author);
        setPrice(price);
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.author;
    }
    public double getPrice(){
        return this.price;
    }
    public void toSTring(){
        System.out.println("Title: "+getTitle());
        System.out.println("Author: "+getAuthor());
        System.out.println("Price: "+getPrice());
    }
}

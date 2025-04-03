package lab9;

class Item{
    protected String title;
    protected String author;
    protected int year;
    public Item(String title,String author,int year)
    {
        this.year=year;
        this.title=title;
        this.author=author;
    }
    public String toString()
    {
        return "title: "+title+" Author: "+author+" year: "+year;
    }
}
class Book extends Item{
    private String publisher;
    private int ISBN;
    public Book(String title,String author,int year,String publisher,int ISBN)
    {
        super(title,author,year);
        this.publisher=publisher;
        this.ISBN=ISBN;
    }

    @Override
    public String toString() {
        return "Book "+ super.toString()+" publisher: "+publisher+" ISBN: "+ISBN;
    }
}

class Magazine extends Item{
    private String publisher;
    private int issueNumber;

    public Magazine(String title,String author,int year,String publisher,int issueNumber)
    {
        super(title,author,year);
        this.publisher=publisher;
        this.issueNumber=issueNumber;
    }

    @Override
    public String toString()
    {
        return "Magazine "+ super.toString()+" Publisher: "+publisher+" IssueNumber: "+issueNumber;
    }
}
class DVD extends Item{
    private int length;
    private String director;

    public DVD(String title,String author,int year,String director,int length)
    {
        super(title,author,year);
        this.director=director;
        this.length=length;
    }

    @Override
    public String toString()
    {
        return "DVD "+ super.toString()+" Length: "+length+" Director: "+director;
    }
}

public class Q1_lab9 {
    public static void main(String[] args) {
        Item book = new Book("Mark X","Henry",1991,"Jhon Martin",123142323);
        Item magazine = new Magazine("Dawn","Quaid",1947,"Pak ltd",23423842);
        Item DVD = new DVD("Sony","Franklin",1995,"GTA V",256);
        System.out.println(book.toString());
        System.out.println(magazine.toString());
        System.out.println(DVD.toString());
    }
}
package Omar;

public class Book extends LibraryItem {
    protected String title;
    protected String author;
    protected int isbn;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }



    @Override
    public void by()
    {
        System.out.println("by");
    }
}

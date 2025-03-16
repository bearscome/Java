package extends1.ex;

public class Book extends Item {
    public String author;
    public String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price);

        System.out.println("- 저자: " + author + " isBn: " + isbn);
        this.author = author;
        this.isbn = isbn;
    }
}

package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayInfo();

        Book book2 = new Book("헬로 자바", "seo");
        book2.displayInfo();

        Book book3 = new Book("JSP ", "kim", 700);
        book3.displayInfo();
    }
}

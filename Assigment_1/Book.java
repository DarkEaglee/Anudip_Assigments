public class Book {
    String title;
    String author;
    int price;

    public Book(String title){
        this.title = title;
        this.price = 2000;
        this.author = "John Doe";
    }

    public Book(int price){
        this.price = price;
        this.author = "John Doe";
        this.title = "Unknown";
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

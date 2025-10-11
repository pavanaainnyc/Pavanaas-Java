public class Book {
    private String title;
    private String author;
    private int yearPublished;

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public void printDetails() {
        System.out.println("Book Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + this.yearPublished);
        System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
   
        Book book1 = new Book("1984", "George Orwell", 1949);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960);

        book1.printDetails();
        book2.printDetails();
    }
}

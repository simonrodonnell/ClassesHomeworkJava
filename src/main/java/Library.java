import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity){
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public void addBook(Book newBook) {
        if (this.books.size() < this.capacity ){
            this.books.add(newBook);
        }
    }

    public int getNumberOfBooks() {
        return this.books.size();
    }

    public Book removeBook(Book book1) {
        int bookIndex = this.books.indexOf(book1);
        return this.books.remove(bookIndex);
    }
}

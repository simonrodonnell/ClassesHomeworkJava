import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower(){
        this.collection = new ArrayList<>();
    }

    public void borrowBook(Library library, Book book1) {
        Book borrowedBook = library.removeBook(book1);
        this.collection.add(borrowedBook);
    }

    public int bookCount() {
        return this.collection.size();
    }
}

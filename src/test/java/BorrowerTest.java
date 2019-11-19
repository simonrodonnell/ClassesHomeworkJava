import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;


    @Before
    public void before(){
        borrower = new Borrower();
        library = new Library(4);
        book1 = new Book("Catch 22", "Joseph Heller", "Satire");
        book2 = new Book("War and Peace", "Leo Tolstoy", "Historical");
        book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Tragedy");
        book4 = new Book("Moby Dick", "Herman Melville", "Epic");
        book5 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBook(library, book1);
        assertEquals(1, borrower.bookCount());
        assertEquals(3, library.getNumberOfBooks());
    }

}

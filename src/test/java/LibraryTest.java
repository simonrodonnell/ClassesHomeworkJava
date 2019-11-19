import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;
    private Book book4;
    private Book book5;

    @Before
    public void before(){
        library = new Library(4);
        book1 = new Book("Catch 22", "Joseph Heller", "Satire");
        book2 = new Book("War and Peace", "Leo Tolstoy", "Historical");
        book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Tragedy");
        book4 = new Book("Moby Dick", "Herman Melville", "Epic");
        book5 = new Book("Pride and Prejudice", "Jane Austen", "Romance");
    }

    @Test
    public void canCountNumberOfBooksInLibrary(){
        assertEquals(0, library.getNumberOfBooks());
    }

    @Test
    public void canAddBooksToLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }

    @Test
    public void canRemoveBookFromLibrary(){
        library.addBook(book1);
        Book removedBook = library.removeBook(book1);
        assertEquals(book1, removedBook);
    }

    @Test
    public void libraryHasCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        assertEquals(4, library.getNumberOfBooks());
    }

}

package ie.atu.userreg;
import java.util.ArrayList;
import java.util.List;

public class LibraryService {

    private List<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }
    public List<Book> getBooks() {
        return library;
    }
}

package ie.atu.userreg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Library")
public class LibraryController {
    private LibraryService libraryService;

    @Autowired
    public void setLibraryService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }
    @PostMapping("/addBook")
    public String addBookToLibrary(@RequestBody Book book){
        libraryService.addBook(book);
        return "added book to library";
    }
    @GetMapping("/getBooks")
    public List<Book> getBooksFromLibrary() {
        return libraryService.getBooks();
    }
}

package ie.atu.userreg;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String title;
    private String author;
    private String isbn;
    private int publishedYear;
}

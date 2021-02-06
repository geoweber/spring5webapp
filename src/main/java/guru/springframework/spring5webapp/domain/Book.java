package guru.springframework.spring5webapp.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;



@Data
@Entity
@NoArgsConstructor
@RequiredArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String title;
    @NonNull
    private String isbn;

    @NonNull
    private Date created;

    @ManyToOne( fetch = FetchType.LAZY, optional = false)
    private Publisher publisher;

    @NonNull
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable()
    private Set<Author> authors = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

        if (!Objects.equals(title, book.title)) return false;
        return Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", created=" + created +
                ", publisher=" + publisher.getName() +
                ", authors=" + authors.size() +
                '}';
    }
}

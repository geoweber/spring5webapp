package guru.springframework.spring5webapp.domain;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.util.*;

import static javax.persistence.CascadeType.ALL;


@Data
@Entity
@NoArgsConstructor
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NonNull
    private String name;
    private String addressLine;
    private String city;
    private String state;
    private String zip;

    @OneToMany(cascade=ALL, mappedBy="publisher", orphanRemoval = true)
  //  @OrderBy("title asc, created asc")
   // @Index(name="index_in_books", columnList="title, created")
    private Set<Book> books= new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Publisher)) return false;

        Publisher publisher = (Publisher) o;

        return Objects.equals(name, publisher.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addressLine='" + addressLine + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}

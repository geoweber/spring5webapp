package guru.springframework.spring5webapp.bootstrap;

import guru.springframework.spring5webapp.repositories.AuthorRepository;
import guru.springframework.spring5webapp.repositories.BookRepository;
import guru.springframework.spring5webapp.repositories.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class BootStrapData  implements CommandLineRunner {

    private final AuthorRepository authorRepository;

    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;


    @Override
    public void run(String... args) throws Exception {

/*


        Publisher publisher = new Publisher();
        publisher.setAddressLine("Address 1");
        publisher.setName("Name 1");
        publisher.setCity("Cologne");
        publisher.setZip("50679");
        publisher.setState("BRD");
        publisher.setBooks(new HashSet<>());

        publisherRepository.save(publisher);

        Author eric = new Author("Eric", "Evans");
        Book book1 = new Book("Book 1", "123123", new Date());
        eric.getBooks().add(book1);
        book1.getAuthors().add(eric);

        book1.setPublisher(publisher);
        publisher.getBooks().add(book1);


        // 2. Book from Publisher
        Book book2 = new Book("Book 2", "123123", new Date());
        eric.getBooks().add(book2);
        book2.getAuthors().add(eric);

        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);


        //authorRepository.save(eric);
       // bookRepository.save(ddd);
        //bookRepository.save(ddd2);
        publisher = publisherRepository.save(publisher);

        Author rod = new Author("Rod", "Jonson");
        Book noEJB = new Book("Book 3 J2EE Development", "123124", new Date());
        // rod.getBooks().add(noEJB);
       // noEJB.getAuthors().add(rod);
        noEJB.setPublisher(publisher);
        publisher.getBooks().add(noEJB);

        // authorRepository.save(rod);
        //bookRepository.save(noEJB);
        publisher = publisherRepository.save(publisher);

        System.out.println("Started Bootstrap  ************************************");

        System.out.println("Number of Book counts: " +  bookRepository.count());
        //bookRepository.findAll().forEach(b->System.out.println(b.toString()));
        publisher.getBooks().stream().forEach(b->System.out.println(b.toString()));

        System.out.println("Publisher Number of Authors: " + publisher.getBooks().size());

       // publisherRepository.deleteById(1L);
        //System.out.println("Number of Book after delete published: " +  bookRepository.count());

*/


    }
}

package it.januszwisniowski.jhipsterpresentation.examples.monolith.repository;

import it.januszwisniowski.jhipsterpresentation.examples.monolith.domain.Book;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * Spring Data JPA repository for the Book entity.
 */
@SuppressWarnings("unused")
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("select distinct book from Book book left join fetch book.authors")
    List<Book> findAllWithEagerRelationships();

    @Query("select book from Book book left join fetch book.authors where book.id =:id")
    Book findOneWithEagerRelationships(@Param("id") Long id);

}

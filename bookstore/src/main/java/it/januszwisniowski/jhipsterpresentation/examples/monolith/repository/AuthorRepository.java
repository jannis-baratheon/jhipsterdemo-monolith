package it.januszwisniowski.jhipsterpresentation.examples.monolith.repository;

import it.januszwisniowski.jhipsterpresentation.examples.monolith.domain.Author;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Author entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}

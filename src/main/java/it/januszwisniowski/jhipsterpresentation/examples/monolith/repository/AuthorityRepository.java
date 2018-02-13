package it.januszwisniowski.jhipsterpresentation.examples.monolith.repository;

import it.januszwisniowski.jhipsterpresentation.examples.monolith.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}

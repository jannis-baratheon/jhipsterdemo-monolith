package it.januszwisniowski.jhipsterpresentation.examples.monolith.service.mapper;

import it.januszwisniowski.jhipsterpresentation.examples.monolith.domain.*;
import it.januszwisniowski.jhipsterpresentation.examples.monolith.service.dto.BookDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Book and its DTO BookDTO.
 */
@Mapper(componentModel = "spring", uses = {AuthorMapper.class})
public interface BookMapper extends EntityMapper<BookDTO, Book> {



    default Book fromId(Long id) {
        if (id == null) {
            return null;
        }
        Book book = new Book();
        book.setId(id);
        return book;
    }
}

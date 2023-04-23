package com.api.book.bootrestbook.Repository;

import com.api.book.bootrestbook.Entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Integer> {
}

package com.api.book.bootrestbook.Repository;

import org.springframework.data.repository.CrudRepository;

import com.api.book.bootrestbook.Entities.Book;

public interface BookRepository extends CrudRepository<Book,Integer> {
    
}

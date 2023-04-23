package com.api.book.bootrestbook.Service;

import com.api.book.bootrestbook.Entities.Author;
import com.api.book.bootrestbook.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthor(){
        return (List<Author>) this.authorRepository.findAll();
    }


}

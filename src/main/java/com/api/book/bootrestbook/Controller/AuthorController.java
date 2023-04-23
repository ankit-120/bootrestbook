package com.api.book.bootrestbook.Controller;

import com.api.book.bootrestbook.Entities.Author;
import com.api.book.bootrestbook.Entities.Book;
import com.api.book.bootrestbook.Service.AuthorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<List<Author>> getAllAuthor(){
        List<Author> list = authorService.getAllAuthor();
        if(list.isEmpty()) {
            return ResponseEntity.notFound().build();
        }else{
//            HashMap<String,String> map = new HashMap<>();
//            List<Author> authList = new ArrayList<>();
//            list.forEach(l->{
//                Author auth = new Author(l.getId(),l.getName(),l.getLanguage(),new Book(l.getBook().getId(),l.getBook().getName()));
//                authList.add(auth);
//            });
            return ResponseEntity.of(Optional.of(list));
        }
    }

}

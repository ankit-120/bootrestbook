package com.api.book.bootrestbook.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.book.bootrestbook.Entities.Book;
import com.api.book.bootrestbook.Repository.BookRepository;

@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        List<Book> books = (List<Book>) bookRepository.findAll();
        return books;
    }

    public Book getBookById(int id){
        try{
            Optional<Book> opt = this.bookRepository.findById(id);
            return opt.get();
        }catch(Exception e){
            e.printStackTrace();
        } 
        return null;
    }

    public Book addBook(Book b){
        Book book = this.bookRepository.save(b);
        return book;
    }

    public void deleteBook(int id){
        try {
            this.bookRepository.deleteById(id);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
    }

    public void updateBook(Book book,int id){
        book.setId(id);
        this.bookRepository.save(book);
    }

}

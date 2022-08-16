package com.graphql.ql.services;

import com.graphql.ql.entities.Book;
import com.graphql.ql.repositories.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class BookServices {

    @Autowired
    private BookRepo bookRepo;

    public Book create(Book book){
        return this.bookRepo.save(book);
    }

    public List<Book> getAll(){
        return this.bookRepo.findAll();
    }

    public Book get(int bookId){
        return this.bookRepo.findById(1).get();
    }
}

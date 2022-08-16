package com.graphql.ql.entities.controllers;

import com.graphql.ql.entities.Book;
import com.graphql.ql.services.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@Controller
public class controllers {
    @Autowired
    private BookServices bookServices;

    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setPages(book.getPages());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());

        return this.bookServices.create(b);
    }

    //@GetMapping
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookServices.getAll();
    }

   // @GetMapping("/{bookId}")
    @QueryMapping("getBook")
        public Book get(@Argument int bookId){
        return this.bookServices.get(bookId);
    }


}

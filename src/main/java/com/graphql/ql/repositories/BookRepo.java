package com.graphql.ql.repositories;

import com.graphql.ql.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {
}

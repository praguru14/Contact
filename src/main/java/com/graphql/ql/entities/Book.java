package com.graphql.ql.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="project_books")
@Data

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}

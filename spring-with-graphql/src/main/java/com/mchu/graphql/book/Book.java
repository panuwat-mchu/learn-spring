package com.mchu.graphql.book;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "books")
public class Book {
    private @Id @GeneratedValue Long id;
    private String name;
    private Long authorId;
}

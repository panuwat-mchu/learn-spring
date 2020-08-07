package com.mchu.graphql.author;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "authors")
public class Author {
    private @Id @GeneratedValue Long id;
    private String name;
}
